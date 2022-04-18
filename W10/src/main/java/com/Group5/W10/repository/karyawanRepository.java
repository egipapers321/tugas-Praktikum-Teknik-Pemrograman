package com.Group5.W10.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;  
import com.Group5.W10.model.karyawan;  
@Repository
//repository that extends CrudRepository  
public interface karyawanRepository extends CrudRepository<karyawan, Integer>  
{  
}  