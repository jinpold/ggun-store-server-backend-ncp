package store.ggun.gatewayserver.domain.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String email;
    private String password;
}
