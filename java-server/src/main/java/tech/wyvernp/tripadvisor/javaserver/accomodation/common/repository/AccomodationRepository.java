package tech.wyvernp.tripadvisor.javaserver.accomodation.common.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.wyvernp.tripadvisor.javaserver.accomodation.common.entity.Accomodation;

import java.util.List;

@Repository
public interface  AccomodationRepository extends JpaRepository<Accomodation, Long> {



    @Query(value = "select\n" +
            "a1_0" +
            "    from\n" +
            "        Accomodation a1_0 \n" +
            "    left outer join\n" +
            "        Location l1_0 \n" +
            "            on a1_0.id=l1_0.accomodation.id \n" +
            "    left outer join\n" +
            "        Hotel h1_0 \n" +
            "            on a1_0.id=h1_0.accomodation.id \n" +
            "    left outer join\n" +
            "        Restaurant r1_0 \n" +
            "            on a1_0.id=r1_0.accomodation.id \n" +
            "    where\n" +
            "        upper(a1_0.name) like upper(concat( '%',:name,'%'))  \n" +
            "        and upper(l1_0.city) like upper(concat( '%',:locationCity,'%'))  ",
            countQuery = "select count(a1_0) " +
            "    from\n" +
            "        Accomodation a1_0 \n" +
            "   left join\n" +
            "        Location l1_0 \n" +
            "            on a1_0.id=l1_0.accomodation.id \n" +
            "    left join\n" +
            "        Hotel h1_0 \n" +
            "            on a1_0.id=h1_0.accomodation.id \n" +
            "    left join\n" +
            "        Restaurant r1_0 \n" +
            "            on a1_0.id=r1_0.accomodation.id \n" +
            "    where\n" +
            "        upper(a1_0.name) like upper(concat( '%',:name,'%')) \n" +
            "        and upper(l1_0.city) like upper(concat( '%',:locationCity,'%'))  ")
//    @EntityGraph(value = "Accomodation.detail")
Page<Accomodation> findAllByNameContainingIgnoreCaseAndLocation_CityContainingIgnoreCase(String name, String locationCity, Pageable pageable);

    @Query(value = "select\n" +
            "a1_0" +
            "    from\n" +
            "        Accomodation a1_0 \n" +
            "    left outer join\n" +
            "        Location l1_0 \n" +
            "            on a1_0.id=l1_0.accomodation.id \n" +
            "    left outer join\n" +
            "        Hotel h1_0 \n" +
            "            on a1_0.id=h1_0.accomodation.id \n" +
            "    left outer join\n" +
            "        Restaurant r1_0 \n" +
            "            on a1_0.id=r1_0.accomodation.id \n" +
            "    where\n" +
            "        upper(a1_0.name) like upper(concat( '%',:name,'%'))  \n" +
            "        and upper(l1_0.countryName) like upper(concat( '%',:locationCountryName,'%'))  ",
            countQuery = "select count(a1_0) " +
            "    from\n" +
            "        Accomodation a1_0 \n" +
            "   left join\n" +
            "        Location l1_0 \n" +
            "            on a1_0.id=l1_0.accomodation.id \n" +
            "    left join\n" +
            "        Hotel h1_0 \n" +
            "            on a1_0.id=h1_0.accomodation.id \n" +
            "    left join\n" +
            "        Restaurant r1_0 \n" +
            "            on a1_0.id=r1_0.accomodation.id \n" +
            "    where\n" +
            "        upper(a1_0.name) like upper(concat( '%',:name,'%')) \n" +
            "        and upper(l1_0.countryName) like upper(concat( '%',:locationCountryName,'%'))  ")
Page<Accomodation> findAllByNameContainingIgnoreCaseAndLocation_CountryNameContainingIgnoreCase(String name,String locationCountryName, Pageable pageable);

//@EntityGraph(value = "hotel")
@Query(value = "select\n" +
        "a1_0" +
        "    from\n" +
        "        Accomodation a1_0 \n" +
        "    left outer join\n" +
        "        Location l1_0 \n" +
        "            on a1_0.id=l1_0.accomodation.id \n" +
        "    left outer join\n" +
        "        Hotel h1_0 \n" +
        "            on a1_0.id=h1_0.accomodation.id \n" +
        "    left outer join\n" +
        "        Restaurant r1_0 \n" +
        "            on a1_0.id=r1_0.accomodation.id \n" +
        "    where\n" +
        "        upper(a1_0.name) like upper(concat( '%',:name,'%'))  \n",
        countQuery = "select count(a1_0) " +
        "    from\n" +
        "        Accomodation a1_0 \n" +
        "   left join\n" +
        "        Location l1_0 \n" +
        "            on a1_0.id=l1_0.accomodation.id \n" +
        "    left join\n" +
        "        Hotel h1_0 \n" +
        "            on a1_0.id=h1_0.accomodation.id \n" +
        "    left join\n" +
        "        Restaurant r1_0 \n" +
        "            on a1_0.id=r1_0.accomodation.id \n" +
        "    where\n" +
        "        upper(a1_0.name) like upper(concat( '%',:name,'%'))" )
Page<Accomodation> findAllByNameContainingIgnoreCase(String name,Pageable pageable);
}
