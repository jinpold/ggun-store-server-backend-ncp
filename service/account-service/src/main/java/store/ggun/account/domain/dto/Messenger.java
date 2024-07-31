package store.ggun.account.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Messenger {
    private String message;
    private int status;
    private String accessToken;
    private String refreshToken;
    private Long id;

}