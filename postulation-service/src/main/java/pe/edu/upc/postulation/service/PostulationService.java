package pe.edu.upc.postulation.service;

import pe.edu.upc.postulation.entity.Postulation;

import java.util.List;

public interface PostulationService {
    public List<Postulation> findPostulationAll();

    public Postulation createPostulation(Postulation postulation);
    public void deletePostulation(Long id);
    public Postulation getPostulation(Long id);

    public List<Postulation> getPostulationsByPostulant(Long id);
    public List<Postulation> getPostulationsByJobOffer(Long id);

}
