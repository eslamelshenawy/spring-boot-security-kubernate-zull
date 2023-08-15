package vmware.services.gateway.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vmware.services.gateway.dto.UserDto;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
@Entity
public class User {

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT AUTO_INCREMENT")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private String role;


    public UserDto mapUsertoUserDto() {
        return new UserDto(id, email, name,password,role);
    }
}
