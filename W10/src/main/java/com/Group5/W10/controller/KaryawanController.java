package com.Group5.W10.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.Group5.W10.model.karyawan;  
import com.Group5.W10.service.KaryawanService;  
//mark class as Controller  
@RestController  
public class KaryawanController   
{  
@Autowired  
KaryawanService karyawanService;  
  
@GetMapping("/karyawan")  
private List<karyawan> getAllKaryawan()   
{  
return karyawanService.getAllkaryawan();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/karyawan/{id}")  
private karyawan getBooks(@PathVariable("id") int id)   
{  
return karyawanService.getBooksById(id);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/karyawan/{id}")  
private void deletekaryawan(@PathVariable("id") int id)   
{  
karyawanService.delete(id);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/karyawans")  
private int saveKaryawan(@RequestBody karyawan karyawans)   
{  
karyawanService.saveOrUpdate(karyawans);  
return karyawans.getId();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/karyawans")  
private karyawan update(@RequestBody karyawan karyawan)   
{  
karyawanService.saveOrUpdate(karyawan);  
return karyawan;  
}  
}  