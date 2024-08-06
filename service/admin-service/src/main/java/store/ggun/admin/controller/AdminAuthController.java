package store.ggun.admin.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import store.ggun.admin.domain.dto.LoginDto;
import store.ggun.admin.domain.dto.PrincipalUserDetails;
import store.ggun.admin.domain.model.Messenger;
import store.ggun.admin.service.LoginService;


@RestController("adminAuthController")
@RequiredArgsConstructor
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@RequestMapping(path = "/auth")
@Slf4j
public class AdminAuthController {
    private final LoginService service;

    // -----------------------------------Query ---------------------------------------

    @PostMapping(path = "/login")
    public PrincipalUserDetails login(@RequestBody LoginDto dto) {
        log.info("입력받은 정보 : {}", dto);
        return service.login(dto);

    }
}
