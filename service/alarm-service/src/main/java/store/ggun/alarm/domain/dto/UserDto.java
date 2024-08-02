package store.ggun.alarm.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Builder
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private String Id;
    private String lastName;
    private String password;
    private String firstName;
    private String email;
}