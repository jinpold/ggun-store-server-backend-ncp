package store.ggun.admin.service;

import store.ggun.admin.domain.dto.LoginDTO;
import store.ggun.admin.domain.model.Messenger;

public interface LoginService {

    Messenger login(LoginDTO admin);

}
