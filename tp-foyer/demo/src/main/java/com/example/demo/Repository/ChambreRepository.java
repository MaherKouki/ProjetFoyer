package com.example.demo.Repository;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long numC);



    /*@Query("SELECT chambre FROM Chambre chambre "
            + "JOIN chambre.reservation reservation "
            + "WHERE reservation.etudiant.cin = :cin")
    Chambre chambreEtudiant(@Param("cin") Long cin);*/

    @Query("SELECT c FROM Chambre c "
            + "JOIN c.reservation r "
            + "JOIN r.etudiant e "
            + "WHERE e.cin = :cin")
    Chambre chambreEtudiant(@Param("cin") Long cin);
}
