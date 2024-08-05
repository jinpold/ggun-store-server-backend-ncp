package store.ggun.admin.serviceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import store.ggun.admin.domain.dto.LoginDto;
import store.ggun.admin.domain.model.AdminModel;
import store.ggun.admin.domain.model.Messenger;
import store.ggun.admin.repository.jpa.AdminRepository;
import store.ggun.admin.service.LoginService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final AdminRepository adminRepository;

    @Override
    public Messenger login(LoginDto admin) {
//        log.info("login 진입 성공 email: {}", admin.getEmail());
//        List<AdminModel> optionalAdminModel = adminRepository.findAdminByEmail(admin.getEmail());
//        if (optionalAdminModel.isPresent()) {
//            AdminModel adminModel = optionalAdminModel.get();
//            boolean flag = adminModel.getPassword().equals(admin.getPassword());
//            return Messenger.builder()
//                    .message(flag ? "SUCCESS" : "FAILURE")
//                    .build();
//        } else {
//            return Messenger.builder()
//                    .message("User does not exist.")
//                    .build();
//        }
//    }
        return null;

    }
}
