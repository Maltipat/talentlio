@Service
public class TutorialService {
  
  @Autowired
  private TutorialRepository tutorialRepository;
  
  public List<Tutorial> getAllTutorials() {
    return tutorialRepository.findAll();
  }
  
  public Tutorial getTutorialById(Long id) {
    return tutorialRepository.findById(id).orElseThrow();
  }
  
  public Tutorial createTutorial(Tutorial tutorial) {
    return tutorialRepository.save(tutorial);
  }
  
  public Tutorial updateTutorial(Long id, Tutorial tutorial) {
    Tutorial existingTutorial = getTutorialById(id);
    existingTutorial.setTitle(tutorial.getTitle());
    existingTutorial.setDescription(tutorial.getDescription());
    existingTutorial.setPublished(tutorial.getPublished());
    return tutorialRepository.save(existingTutorial);
  }
  
  public void deleteTutorial(Long id) {
    tutorialRepository.deleteById(id);
  }
}