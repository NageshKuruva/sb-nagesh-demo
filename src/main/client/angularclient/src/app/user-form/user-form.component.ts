import { Component, OnInit } from '@angular/core';
import { User } from 'src/model/user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from 'src/service/user-service.service';

@Component({
  providers: [UserServiceService],
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  user: User;
  constructor(private route:ActivatedRoute,
      private router:Router,
        private userService:UserServiceService) {
          this.user = new User();
         }
  onSubmit(){
   // this.userService.save(this.user).(result=>{this.gotoUserList()});
    
  }

  gotoUserList(){
    this.router.navigate(['/users']);
  }

  ngOnInit() {
  }

}
