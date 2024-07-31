package store.ggun.gateway.router;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import store.ggun.gateway.domain.dto.LoginDto;
import store.ggun.gateway.service.AuthService;

@Configuration
@RequiredArgsConstructor
public class AuthRouter {
    private final AuthService authService;

    @Bean
    public RouterFunction<ServerResponse> authRoutes() {
        return RouterFunctions.route()
                .path("/auth", builder -> builder
                        .POST("/login/local", req -> req.bodyToMono(LoginDto.class).flatMap(authService::localLogin))
                        .POST("/refresh", req -> authService.refresh(req.headers().header(HttpHeaders.AUTHORIZATION).get(0)))
                        .POST("/logout", req -> authService.logout(req.headers().header(HttpHeaders.AUTHORIZATION).get(0)))
                )
                .build();
    }
}
