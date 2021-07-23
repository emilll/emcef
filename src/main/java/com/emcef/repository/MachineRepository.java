package com.emcef.repository;

import com.emcef.model.MachinesInstallees;
import java.util.List;
import org.json.simple.JSONObject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Em
 */
@Repository
public interface MachineRepository extends JpaRepository<MachinesInstallees, Long> {

    @Query(value = "SELECT *  FROM  machineinstallees", nativeQuery = true)
    List<MachinesInstallees> getAllMachines();
    
    @Query(value = "SELECT count(*)  FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    int nrbFactNim(@Param("nim") String nim);
    
    @Query(value = "SELECT * FROM  machineinstallees c WHERE c.nim = :nim", nativeQuery = true)
    MachinesInstallees findAllByNim(@Param("nim") String nim);
    
    @Query(value = "SELECT *  FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    List<JSONObject> allFact(@Param("nim") String nim);
    
    @Query(value = "SELECT count(*) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    int totalFactures(@Param("nim") String nim);
    
    @Query(value = "SELECT sum(total) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    double totalTTC(@Param("nim") String nim);
    
    @Query(value = "SELECT sum(total_taxable) FROM  factureselonspecification c WHERE c.nim = :nim", nativeQuery = true)
    double totalHT(@Param("nim") String nim);
    
    @Query(value = "SELECT count(*) FROM rapportcr r,machinesenregistrees m, machineinstallees i WHERE r.machinesenregistrees_id = m.id AND m.machinesinstalles_id = i.id AND i.nim = :nim", nativeQuery = true)
    int totalRapport(@Param("nim") String nim);

    public MachinesInstallees findByIfu(String ifu);

    public List<MachinesInstallees> findAllByIfu(String ifu);

    public MachinesInstallees findByApikey(String Apikey);
}
