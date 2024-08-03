package store.ggun.admin.service;
import store.ggun.admin.domain.model.Messenger;
import store.ggun.admin.domain.dto.AdminDTO;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    Messenger login(AdminDTO adminDto);
    String createToken(AdminDTO adminDto);
}
