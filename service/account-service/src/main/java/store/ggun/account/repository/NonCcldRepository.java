package store.ggun.account.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store.ggun.account.domain.model.NonCcldModel;

@Repository
public interface NonCcldRepository extends JpaRepository<NonCcldModel,Long> {
//    List<NonCcldDto> findByAccount(Long id);
//
//    long countByAccount();
}
