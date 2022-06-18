package pe.edu.upc.postulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.postulation.entity.Postulation;

import java.util.ArrayList;
import java.util.List;

public interface PostulationRepository extends JpaRepository<Postulation,Long> {
    public Postulation findByNumberPostulation(String numberPostulation);

    public default List<Postulation> findByPostulant(Long id){
        List<Postulation> postulationList = this.findAll();
        List<Postulation> oneSpecificPostulant = new ArrayList<>();
        for(Postulation es : postulationList) {
            if(es.getPostulantId().equals(id)) {
                oneSpecificPostulant.add(es);
            }
        }
        return oneSpecificPostulant;
    };

    public default List<Postulation> findByJobOffer(Long id){
        List<Postulation> postulationList = this.findAll();
        List<Postulation> oneSpecificJobOffer = new ArrayList<>();
        for(Postulation es : postulationList) {
            if(es.getJobOfferId().equals(id)) {
                oneSpecificJobOffer.add(es);
            }
        }
        return oneSpecificJobOffer;
    }

}
