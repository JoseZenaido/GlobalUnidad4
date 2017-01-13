package bootstrap.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootstrap.dao.SalaryRepository;
import bootstrap.model.Salary;

@Service @Transactional
public class SalaryService {

		private final SalaryRepository salaryRepository;

		public SalaryService(SalaryRepository salaryRepository) {
			super();
			this.salaryRepository = salaryRepository;
		}
		
		public List<Salary> findAll(){
			List<Salary> salaries = new ArrayList<Salary>();
			for (Salary salary : salaryRepository.findAll()) {
				salaries.add(salary);
			}
			return salaries;
		}
		
		public void save(Salary salary){
			salaryRepository.save(salary);
		}
		
		public void delete(int emNo){
			salaryRepository.delete(emNo);
		}
		
		public Salary findSalary(int emNo){
			return salaryRepository.findOne(emNo);
		}

}
