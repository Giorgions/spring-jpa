package pl.edu.wszib.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.Praca;

import java.time.Instant;
import java.util.List;

@Repository
public interface PracaDao extends JpaRepository<Praca, Long> {

    //kilka sposobów

    @Query(nativeQuery = true,
            value = "select * from dbo.praca where stanowisko like ?0")
    List<Praca> mojeSuperQuery2(@Param("stanowisko") String stanowisko);

    @Query("select p from Praca p where p.stanowisko like :stanowisko")
    List<Praca> mojeSuperQuery(@Param("stanowisko") String stanowisko);

    List<Praca> findAllByStanowiskoContains(String stanowisko);


    Praca findFirstByCreatedAtBefore(Instant time);
    List<Praca> findAllByStanowiskoAndAndNazwaFirmyOrderByCreatedAtDesc(String stanowisko, String nazwaFirmy);
}
