package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
