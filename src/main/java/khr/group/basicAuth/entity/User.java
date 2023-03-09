package khr.group.basicAuth.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Objects;


@Getter
@Setter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Users")
public class User  {

    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, length = 20, name = "userType")
    private String role;

    @Column( length = 200)
    private String address;

    @Column( length = 13)
    private String telephone;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false, length = 4,name = "tabel")
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 100)
    private Boolean status;

    @Column(nullable = false)
    private String avatar;


  /*  @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       *//* Set<String>roleSet=new HashSet<>();
        roleSet.add(this.role);*//*
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
