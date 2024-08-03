package store.ggun.admin.service;

import store.ggun.admin.domain.dto.LoginDto;
import store.ggun.admin.domain.model.Messenger;

public interface LoginService {

    Messenger login(LoginDto admin);

}
