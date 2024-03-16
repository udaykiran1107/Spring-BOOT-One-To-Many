package in.uday.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.uday.entity.Address;
import in.uday.entity.Emp;
import in.uday.repo.AddressRepo;
import in.uday.repo.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo erepo;
	@Autowired
	private AddressRepo arepo;
	public void delemp() {
		erepo.deleteById(1);
	}
	public void getadd() {
		 arepo.findById(1);
	}
	public void getemp() {
		Optional<Emp> byId = erepo.findById(1);
		if(byId.isPresent()) {
			Emp emp = byId.get();
			List<Address> addlist = emp.getAddlist();
			System.out.println(addlist);
		}
	}
	public void saveemp() {
		Emp e=new Emp();
		e.setEname("uday");
		e.setSalary(9000.00);
		
		
		Address a=new Address();
		a.setCity("pune");
		a.setCountry("india");
		a.setState("mumbai");
		a.setType("permanent");
		a.setEmp(e);
		
		Address a1=new Address();
		a1.setCity("noida");
		a1.setCountry("india");
		a1.setState("up");
		a1.setType("present");
		a1.setEmp(e);
		List<Address> aa = Arrays.asList(a,a1);
		e.setAddlist(aa);
		erepo.save(e);
	}

}
