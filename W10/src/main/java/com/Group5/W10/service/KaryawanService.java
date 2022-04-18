package com.Group5.W10.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.Group5.W10.model.karyawan;  
import com.Group5.W10.repository.karyawanRepository;  
//defining the business logic  
@Service  
public class KaryawanService   
{  
@Autowired
karyawanRepository karyawanRepository;  
 
public List<karyawan> getAllkaryawan()   
{  
List<karyawan> karyawan = new ArrayList<karyawan>();  
karyawanRepository.findAll().forEach(karyawan1 -> karyawan.add(karyawan1));  
return karyawan;  
}  
 
public karyawan getBooksById(int id)   
{  
return karyawanRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(karyawan karyawan)   
{  
karyawanRepository.save(karyawan);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	karyawanRepository.deleteById(id);  
}  
//updating a record  
public void update(karyawan karyawan, int id)   
{  
	karyawanRepository.save(karyawan);  
}  
}  
