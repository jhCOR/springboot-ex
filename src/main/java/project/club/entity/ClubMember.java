package project.club.entity;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ClubMember extends BaseEntity {
    
    @Id
    private String email;

    private String password;

    private String name;

    private boolean fromSocial;

    @ElementCollection(fetch = FetchType.LAZY)
    private Set<ClubMemberRole> roleSet;

    public void addMemberRole(ClubMemberRole clubMemberRole){
        roleSet.add(clubMemberRole);
    }
    
    // public Builder email(String value) {
    //     email = value;
    //     return this;
    // }
    // public Builder password(String value) {
    //     password = value;
    //     return this;
    // }
    // public Builder name(String value) {
    //     name = value;
    //     return this;
    // }
    // public Builder fromSocial(String value) {
    //     fromSocial = value;
    //     return this;
    // }

}
