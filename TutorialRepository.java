public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  
    List<Tutorial> findByTitleContaining(String title);
  }