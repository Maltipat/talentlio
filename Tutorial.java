@Entity
@Table(name = "tutorials")
public class Tutorial {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "published")
  private Boolean published;
  
  // Getters and setters
}