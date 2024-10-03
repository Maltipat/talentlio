@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {
  
  @Autowired
  private TutorialService tutorialService;
  
  @GetMapping
  public List<Tutorial> getAllTutorials() {
    return tutorialService.getAllTutorials();
  }
  
  @GetMapping("/{id}")
  public Tutorial getTutorialById(@PathVariable Long id) {
    return tutorialService.getTutorialById(id);
  }
  
  @PostMapping
  public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
    return tutorialService.createTutorial(tutorial);
  }
  
  @PutMapping("/{id}")
  public Tutorial updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorial) {
    return tutorialService.updateTutorial(id, tutorial);
  }
  
  @DeleteMapping("/{id}")
  public void deleteTutorial(@PathVariable Long id) {
    tutorialService.deleteTutorial(id);
  }
}