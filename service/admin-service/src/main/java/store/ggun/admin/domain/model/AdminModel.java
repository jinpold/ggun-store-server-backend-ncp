package store.ggun.admin.domain.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity(name = "admins")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
@ToString(exclude = {"id"})
@AllArgsConstructor
public class AdminModel extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Column(name = "enp_name")
    private String enpName;
    private String enpNum;
    private String department;
    private String position;
    private String job;
    @Column(name = "enp_email")
    private String enpEmail;
    private String phone;
    private String role;
    private String token;


    @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ArticleModel> articleModel;

    public void setPassword(String password) {
        this.password = password;
    }
}