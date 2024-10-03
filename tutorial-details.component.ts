import { Component, OnInit } from '@angular/core';
import { TutorialService } from '../tutorial.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-tutorial-details',
  templateUrl: './tutorial-details.component.html',
  styleUrls: ['./tutorial-details.component.css']
})
export class TutorialDetailsComponent implements OnInit {
  
  tutorial: any;
  
  constructor(private tutorialService: TutorialService, private route: ActivatedRoute) { }
  
  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.tutorialService.getTutorialById(id).subscribe(tutorial => {
      this.tutorial = tutorial;
    });
  }
}