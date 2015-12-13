package tn.esprit.interfaces;

import java.util.List;

import tn.esprit.domain.Eleve;

public interface IEleveServices {
  public boolean AddEleve (Eleve eleve);
  public boolean DeleteEleve (Eleve eleve);
  public boolean UpdateEleve (Eleve eleve);
  public Eleve FindEleveByid(int id) ;
  public List<Eleve> FindAllEleves ();
  
  
  
}
