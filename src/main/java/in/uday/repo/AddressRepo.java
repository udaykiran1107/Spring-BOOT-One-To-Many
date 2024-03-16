package in.uday.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uday.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
