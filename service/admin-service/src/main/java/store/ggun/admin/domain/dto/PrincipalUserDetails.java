package store.ggun.admin.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import store.ggun.admin.domain.model.AdminModel;

import java.util.Map;

@Getter
@NoArgsConstructor
@Component
@Setter
public class PrincipalUserDetails {

    private AdminModel admin;
    private Map<String, Object> attributes;

    public PrincipalUserDetails(AdminModel admin) {
        this.admin = admin;
    }

    public PrincipalUserDetails(AdminModel admin, Map<String, Object> attributes) {
        this.admin = admin;
        this.attributes = attributes;
    }

}