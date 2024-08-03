package store.ggun.admin.service;
import store.ggun.admin.domain.model.Messenger;
import store.ggun.admin.domain.model.AdminModel;
import store.ggun.admin.domain.dto.AdminDTO;
import java.util.Optional;

public interface AdminService extends CommandService<AdminDTO>, QueryService<AdminDTO> {
    // command
    Messenger modify(AdminDTO adminDto);
    Messenger modifyRole(AdminDTO adminDto);
    Messenger update(AdminDTO adminDto);
    // query
    Messenger login(AdminDTO adminDTO);
    Boolean existsByUsername(String username);
    boolean findAdminByEmail(String email);
    Optional<AdminModel> findAdminByRole(String role);
    Optional<AdminModel> findAdminByUsername(String enpName);
    Boolean logout(String accessToken);
    Optional<AdminDTO> findUserInfo(String username);



    default AdminModel dtoToEntity(AdminDTO dto){
        return AdminModel.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .enpName(dto.getEnpName())
                .enpNum(dto.getEnpNum())
                .department(dto.getDepartment())
                .position(dto.getPosition())
                .job(dto.getJob())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .role(dto.getRole())
                .token(dto.getToken())
                .build();
    }


    default AdminDTO entityToDto(AdminModel ent) {
        return AdminDTO.builder()
                .id(ent.getId())
                .username(ent.getUsername())
                .password(ent.getPassword())
                .enpName(ent.getEnpName())
                .enpNum(ent.getEnpNum())
                .department(ent.getDepartment())
                .position(ent.getPosition())
                .job(ent.getJob())
                .email(ent.getEmail())
                .phone(ent.getPhone())
                .role(ent.getRole())
                .token(ent.getToken())
                .build();
    }



}


