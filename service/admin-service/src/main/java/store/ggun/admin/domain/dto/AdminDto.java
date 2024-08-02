package store.ggun.admin.domain.dto;
import store.ggun.admin.domain.model.ArticleModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
public class AdminDto {
    private Long id;
    private String username;
    private String password;
    private String enpName;
    private String enpNum;
    private String department;
    private String position;
    private String job;
    private String enpEmail;
    private String phone;
    private String role;
    private String token;
    private List<ArticleModel> articleModels;

}