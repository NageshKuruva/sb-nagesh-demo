#Best Practices
#References: https://www.baeldung.com/spring-boot-angular-web
1) npm install -g @angular/cli -> downloads latest angular CLI
2) ng new angularclient -> run from project folder from command, creates entire project structure.
3) Entry point of any angular application -> index.html
4) <app-root></app-root> -> root selector that angular uses for rendering application's root component.

5) app.component.ts -> Root Component
6) Understand how an angular binds html to a component. src/app (edit & try with app.compoenent.ts).
7) @Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

	@Component -> metadata marker or decorator - defines 3 elements
	selector -> HTML selector used to bind the component to the HTML template file.
	templateUrl -> the HTML template file associated with component.
	styleUrls -> one or more css files associated with the HTML template file.
	
	As expected, we can use the app.component.html and app.component.css files to define the HTML template and the CSS styles of the root component.

Finally, the selector element binds the whole component to the <app-root> selector included in the index.html file.

8) let implement simple angular domain model class with TypeScript - create user model class
