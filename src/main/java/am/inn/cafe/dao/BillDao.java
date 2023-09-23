package am.inn.cafe.dao;

import am.inn.cafe.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill, Integer> {;


}
