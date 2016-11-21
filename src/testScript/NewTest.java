package testScript;

import org.testng.annotations.Test;
import baseDemo.AddCollection;
import baseDemo.BaseClass;
import baseDemo.CourseManager;
import baseDemo.FlashcradBook;
import baseDemo.GlobalSticky;
import baseDemo.Bookmark;  
import baseDemo.ScrollPageClass;
import baseDemo.TableOfContent;
import baseDemo.ZoomClass;

public class NewTest extends BaseClass {
	
 
 @Test
  public void courseManager(){
	 CourseManager cm=new CourseManager(driver);
	 cm.course_manager();
	 
 }

 
 @Test(priority = 6)
 public void addCollection()
 {
	 AddCollection addColl= new AddCollection(driver);
	 addColl.add_Collection();
	 
 }

 

 @Test(priority = 5)
 public void flashcard_Book() throws InterruptedException
 {
	 FlashcradBook flashcard =new FlashcradBook(driver);
     flashcard.bookOpen1();
	 flashcard.tapFlashCard();
	 flashcard.veryFlashCard();
	 flashcard.someWhat();
	 flashcard.notWell();
	 flashcard.definition();
	 flashcard.term();
	 flashcard.overFlowAction();
	 flashcard.home_CM1();
 }
 

@Test(priority = 0)
 public void gSticky() throws InterruptedException
 {
	 GlobalSticky g=new GlobalSticky(driver);
	
	 g.addGlobalSticky();
 }

 @Test(priority = 3)
 public void tableOfContent() throws InterruptedException
 {
	 TableOfContent toc=new TableOfContent(driver);


	 toc.tableContent();
 }
 @Test(priority = 1)
 public void bookMark() throws InterruptedException
 {
	 Bookmark page=new Bookmark(driver);
	 page.bookmark();
 }
 
 @Test(priority = 4)
 public void zoom() throws InterruptedException
 {
	 ZoomClass z=new ZoomClass(driver);
	 z.zoom();
 }
 
 @Test(priority = 2)
 public void scrollpage() throws InterruptedException
 {
	 ScrollPageClass scroll= new ScrollPageClass(driver);
	 scroll.scroll_Page();
 }
 

 }
 

