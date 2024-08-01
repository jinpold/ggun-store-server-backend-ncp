package store.ggun.gatewayserver.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import store.ggun.gatewayserver.domain.vo.Registration;
import store.ggun.gatewayserver.domain.vo.Role;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String id;
    private String email;
    private String name;
    private List<Role> roles;
    private Registration registration;
}
