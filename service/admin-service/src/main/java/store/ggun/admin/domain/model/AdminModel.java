package store.ggun.admin.domain.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @Column(name = "enp_num")
    private String enpNum;
    private String department;
    private String position;
    private String job;
    @NotNull
    private String email;
    private String phone;
    private String role;
    private String token;
    @NotNull
    private String profile;


    @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ArticleModel> articleModel;

    public void setPassword(String password) {
        this.password = password;
    }
}