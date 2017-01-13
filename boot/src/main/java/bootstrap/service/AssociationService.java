package bootstrap.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootstrap.dao.AssociationRepository;
import bootstrap.model.Association;

@Service @Transactional
public class AssociationService {
	private final bootstrap.dao.AssociationRepository associationRepository;

	public AssociationService(AssociationRepository associationRepository) {
		super();
		this.associationRepository = associationRepository;
	}
	
	public List<Association> findAll(){
		List<Association> associations = new ArrayList<Association>();
		for (Association association : associationRepository.findAll()) {
			associations.add(association);
		}
		return associations;
	}
	
	public void save(Association association){
		associationRepository.save(association);
	}
	
	public void delete(int id){
		associationRepository.delete(id);
	}
	
	public Association findAssociation(int id){
		return associationRepository.findOne(id);
	}
}
