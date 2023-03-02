/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.iticket.repository;

import iticket.iticket.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author jcga5
 */

@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
}