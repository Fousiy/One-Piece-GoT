import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.*; 
import java.util.Random; 
import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OnePieceGOT extends PApplet {

//Last updated 3/19/18






//StartScreen
PImage StartScreen;
PFont title;

//PlayerStatScreen  
PImage PlayerStats;
PImage NavyAttack;

//NavyDeck
PImage img1;
PImage img2;
PImage img3;
PImage img4;
PImage img5;
PImage img6;
PImage img7;
PImage img8;
PImage img9;
PImage img10;
PImage img11;
PImage img12;
PImage img13;
PImage img14;
PImage img15;
PImage LastNavyCardImage;

//PhaseIVDeck
PImage im1;
PImage im2;
PImage im3;
PImage im4;
PImage im5;
PImage im6;
PImage im7;
PImage im8;
PImage im9;
PImage im10;
PImage im11;
PImage im12;
PImage im13;
PImage im14;
PImage im15;
PImage im16;
PImage im17;
PImage im18;
PImage im19;
PImage im20;
PImage LastPhaseIVCardImage;

//ContinentDeck
PImage i1;
PImage i2;
PImage i3;
PImage i4;
PImage i5;
PImage i6;
PImage i7;
PImage i8;
PImage i9;
PImage i10;
PImage i11; 
PImage i12; 
PImage i13; //Raftel


//Continent Rules
PImage SkypieaRules;
PImage FishmanRules;
PImage NewWorldRules;
PImage PunkHazardRules;
PImage WaterSevenRules;
PImage SabaodyRules;
PImage WholeCakeRules;
PImage GrandLineRules;
PImage EniesLobbyRules;
PImage ImpelDownRules;
PImage MarineFordRules; 
PImage RaftelRules;
PImage ContinentRules;
PImage LandOfWanoRules;

Random random = new Random();

int NavyDeckArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
int PhaseIVarray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
int Continentarray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

String LastNavyCard;
String LastPhaseIVCard;
String LastContinentCard;

int navycounter = 0;
int phasecounter = 0;
int continentcounter = 0;
int YousifBounty = 0;
int ShawnBounty = 0;
int MohsinBounty = 0;
int AmeenBounty = 0;

//Raftel Button
float x = 1600;
float y = 90;
float w = 150;
float h = 80;

//Player Stats Button
float x1 = 1600;
float y1 = 915;
float w1 = 150;
float h1 = 80;

//Previous Navy Card Button
float x2 = 260;
float y2 = 162;
float w2 = 35;
float h2 = 35;

//Previous PhaseIV Card Button
float x3 = 310;
float y3 = 250;
float w3 = 35;
float h3 = 35;

//Continent Rules Button
float x4 = 185;
float y4 = 77;
float w4 = 35;
float h4 = 35;

//Navy Attack Reset Button
float x5 = 1870;
float y5 = 135;
float w5 = 35;
float h5 = 35;

//General
int zero = 0;
int YSubcount = 100;
int SSubcount = 100;
int MSubcount = 100;
int ASubcount = 100;
int NavyAttackCount = 0;
float versionnum = 2.5f;
boolean IPB = false;
boolean mainmenu = true;
boolean ngenerate = false;
boolean pgenerate = false;
boolean cgenerate = false;
boolean nfound = false;
boolean pfound = false;
boolean cfound = false;
boolean DisplayRButton = true;
boolean PlayerBounties = true;

//Navy
boolean used1 = false;
boolean used2 = false;
boolean used3 = false;
boolean used4 = false;
boolean used5 = false;
boolean used6 = false;
boolean used7 = false;
boolean used8 = false;
boolean used9 = false;
boolean used10 = false;
boolean used11 = false;
boolean used12 = false;
boolean used13 = false;
boolean used14 = false;
boolean used15 = false;

//PhaseIV
boolean use1 = false;
boolean use2 = false;
boolean use3 = false;
boolean use4 = false;
boolean use5 = false;
boolean use6 = false;
boolean use7 = false;
boolean use8 = false;
boolean use9 = false;
boolean use10 = false;
boolean use11 = false;
boolean use12 = false;
boolean use13 = false;
boolean use14 = false;
boolean use15 = false;
boolean use16 = false;
boolean use17 = false;
boolean use18 = false;
boolean use19 = false;
boolean use20 = false;

//Continent
boolean us1 = false;
boolean us2 = false;
boolean us3 = false;
boolean us4 = false;
boolean us5 = false;
boolean us6 = false;
boolean us7 = false;
boolean us8 = false;
boolean us9 = false;
boolean us10 = false;
boolean us11 = false;
boolean us12 = false; //wano
boolean us13 = false;

public void setup() 
{ 
  
  width = displayWidth;
  height = displayHeight;
  
  //Main Menu
  StartScreen = loadImage("StartScreen.jpg");
  
  //Player Stats
  PlayerStats = loadImage("PlayerStats.jpg");
  NavyAttack = loadImage("NavyAttack.jpg");
  
  //Navy Deck
  img1 = loadImage("Captured.jpg");
  img2 = loadImage("Kizaru.jpg");
  img3 = loadImage("BusterCall.jpg");
  img4 = loadImage("CP9.jpg");
  img5 = loadImage("SengokuGarpPrime.jpg");
  img6 = loadImage("SengokuGarpPresent.jpg");
  img7 = loadImage("DraculeMihawk.jpg");
  img8 = loadImage("BoaHancock.jpg");
  img9 = loadImage("RoadPoneglyph.jpg");
  img10 = loadImage("RoadPoneglyph2.jpg");
  img11 = loadImage("BattleofMarineford.jpg");
  img12 = loadImage("Fujitora.jpg");
  img13 = loadImage("TheFiveElderStars.jpg");
  img14 = loadImage("TransportingPrisoners.jpg");
  img15 = loadImage("TransponderSnail.jpg");
  
  //PhaseIV Deck
  im1 = loadImage("akainu.jpg");
  im2 = loadImage("foxy.jpg");
  im3 = loadImage("aokoji.jpg");
  im4 = loadImage("doffy.jpg");
  im5 = loadImage("pirateking.jpg");
  im6 = loadImage("shodaiowner.jpg");
  im7 = loadImage("emperor.jpg");
  im8 = loadImage("kaido.jpg");
  im9 = loadImage("RoadPoneglyph3.jpg");
  im10 = loadImage("buggysama.jpg");
  im11 = loadImage("RoadPoneglyph4.jpg");
  im12 = loadImage("setsail.jpg");
  im13 = loadImage("setsail2.jpg");
  im14 = loadImage("setsail3.jpg");
  im15 = loadImage("setsail4.jpg");
  im16 = loadImage("WorldNoble.jpg");
  im17 = loadImage("Notorious.jpg");
  im18 = loadImage("NavyTension.jpg");
  im19 = loadImage("setsail5.jpg");
  im20 = loadImage("WorstGeneration.jpg");
  
  //Continent Deck
  i1 = loadImage("skypiea.jpg");
  i2 = loadImage("fishman.jpg");
  i3 = loadImage("newworld.jpg");
  i4 = loadImage("punkhazard.jpg");
  i5 = loadImage("waterseven.jpg");
  i6 = loadImage("sabaody.jpg");
  i7 = loadImage("wholecake.jpg");
  i8 = loadImage("grandline.jpg");
  i9 = loadImage("Enieslobby.jpg");
  i10 = loadImage("ImpelDown.jpg");
  i11 = loadImage("Marineford.jpg");
  i12 = loadImage("LandOfWano.jpg");
  i13 = loadImage("raftel.jpg");
  
  
  //Continent Rules
  SkypieaRules = loadImage("SkypieaRules.jpg");
  FishmanRules = loadImage("FishManIslandRules.jpg");
  NewWorldRules = loadImage("NewWorldRules.jpg");
  PunkHazardRules = loadImage("PunkHazardRules.jpg");
  WaterSevenRules = loadImage("WaterSevenRules.jpg");
  SabaodyRules = loadImage("SabaodyRules.jpg");
  WholeCakeRules = loadImage("WholeCakeRules.jpg");
  GrandLineRules = loadImage("GrandLineRules.jpg");
  EniesLobbyRules = loadImage("EniesLobbyRules.jpg");
  ImpelDownRules = loadImage("ImpelDownRules.jpg");
  MarineFordRules = loadImage("MarineFordRules.jpg");
  LandOfWanoRules = loadImage("LandOfWanoRules.jpg");
  RaftelRules = loadImage("RaftelRules.jpg");
  
  MainMenu();
}
public void MainMenu()
{ 
  image(StartScreen, 0, 0, width, height);
  title = createFont("font", 100, true);
  textAlign(CENTER);
  fill(0);
  rect(454,320,1015,76);
  rect(397,517,1125,76);
  rect(367,702,1165,76);
  fill(255);
  textSize(30);
  ellipse(960, 128, 900, 245);
  fill(0);
  text("Press s to reshuffle the Navy Deck", 960, 70); 
  text("Press m to reshuffle the Phase IV Deck", 960, 140);
  text("Press o to reshuffle the Continent Deck", 960, 210); 
  textSize(65);
  fill(255);
  text("Press n to generate a Navy Card", 960, 380); 
  text("Press p to generate a Phase IV Card", 960, 575); 
  text("Press c to generate a Continent Card ", 960, 760); 
  ellipse(960, 920, 600, 120);
  textSize(30);
  fill(0);
  text("Press b to go back to the Main Menu ", 975, 925); 
  textSize(35);
  fill(255,212,0);
  text("Raftel", 1680, 85);
  textSize(35);
  fill(255,212,0);
  text("Player Stats", 1680, 910);
  //Version
  fill(255);
  textSize(40);
  text(" Version " + versionnum, 130, 1050); 
  if(ngenerate == true)
  {
    fill(255,0,0);
    stroke(50);
    textSize(30);
    text(LastNavyCard, 175, 232);
  }
  if(pgenerate == true)
  {
    fill(255,0,0);
    stroke(50);
    textSize(30);
    text(LastPhaseIVCard, 175, 320);
  }
  if(cgenerate == true)
  {
    fill(255,0,0);
    stroke(50);
    textSize(30);
    text(LastContinentCard, 175, 146);
  }
}

public void PlayerStats()
{
  DisplayRButton = false;
  image(PlayerStats, 0, 0, width, height);
  
  //Yousif's Bounty
  textSize(60);
  fill(255,212,0);
  text(YousifBounty, 475, 440);
  //Shawn's Bounty
  textSize(60);
  fill(255,212,0);
  text(ShawnBounty, 1576, 426);
  //Mohsin's Bounty
  textSize(60);
  fill(255,212,0);
  text(MohsinBounty, 462, 892);
  //Ameen's Bounty
  textSize(60);
  fill(255,212,0);
  text(AmeenBounty, 1576, 892);
  //Navy Attack Count
  textSize(60);
  fill(255,212,0);
  text(NavyAttackCount, 1825, 176); 
}

public void draw() 
{
  //Raftel Button
  if(DisplayRButton == true)
  {
    rect(x,y,w,h);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x && mouseX <x+w && mouseY>y && mouseY <y+h)
      {
        fill(0);
        mainmenu = false;
        DisplayRButton = false;
        Raftel();
      }
    } 
  }
  
  //Player Stats Button
  if(PlayerBounties == true)
  {
    rect(x1,y1,w1,h1);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x1 && mouseX <x1+w1 && mouseY>y1 && mouseY <y1+h1)
      {
        fill(0);
        mainmenu = false;
        PlayerBounties = false;
        IPB = true;
        PlayerStats();
      }
    } 
  }
  
  //Previous Navy Card Button
  if(mainmenu == true && ngenerate == true)
  {
    rect(x2,y2,w2,h2);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x2 && mouseX <x2+w2 && mouseY>y2 && mouseY <y2+h2)
      {
        fill(0);
        PlayerBounties = false;
        IPB = false;
        DisplayRButton = false;
        mainmenu = false;
        if(ngenerate == true || pgenerate == true || cgenerate == true)
        {
          image(LastNavyCardImage, 0, 0, width, height);
        }
      }
    }
  }
   
  //Previous PhaseIV Card Button
  if(mainmenu == true && pgenerate == true)
  {
    rect(x3,y3,w3,h3);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x3 && mouseX <x3+w3 && mouseY>y3 && mouseY <y3+h3)
      {
        fill(0);
        PlayerBounties = false;
        IPB = false;
        DisplayRButton = false;
        mainmenu = false;
        if(pgenerate == true)
        {
          background(0);
          image(LastPhaseIVCardImage, 0, 0, width, height);
        }
      }
    }
   }
    
  //Continent Rules Button
  if(mainmenu == true && cgenerate == true)
  {
    rect(x4,y4,w4,h4);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x4 && mouseX <x4+w4 && mouseY>y4 && mouseY <y4+h4)
      {
        fill(0);
        PlayerBounties = false;
        IPB = false;
        DisplayRButton = false;
        mainmenu = false;
        background(0);
        image(ContinentRules, 0, 0, width, height);
      }
    }
   }
   
  //Navy Attack Reset Button
  if(PlayerBounties == false && IPB == true)
  {
    rect(x5,y5,w5,h5);
    fill(255);
    if(mousePressed)
    {
      if(mouseX>x5 && mouseX <x5+w5 && mouseY>y5 && mouseY <y5+h5)
      {
        fill(0);
        mainmenu = false;
        PlayerBounties = false;
        NavyAttackCount = 0;
        PlayerStats();
      }
    } 
  }
}

public void NavyDeckGenerator()
{
  if(ngenerate == true)
  {
  for(int i = 0; i < 15; i++)
  {
    if(NavyDeckArray[i] == 1 && nfound == false  && used1 == false)
    {
      image(img1, 0, 0, width, height);
      nfound = true;
      used1 = true;
      i++;
      navycounter++;
      LastNavyCard = "Captured";
      LastNavyCardImage = img1;
    }
    else if(NavyDeckArray[i] == 2  && nfound == false  && used2 == false)
    {
      image(img2, 0, 0, width, height);
      nfound = true;
      used2 = true;
      i++;
      navycounter++;
      LastNavyCard = "Kizaru";
      LastNavyCardImage = img2;
    }
    else if(NavyDeckArray[i] == 3  && nfound == false  && used3 == false)
    {
      image(img3, 0, 0, width, height);
      nfound = true;
      used3 = true;
      i++;
      navycounter++;
      LastNavyCard = "Buster Call";
      LastNavyCardImage = img3;
    }
    else if(NavyDeckArray[i] == 4  && nfound == false  && used4 == false)
    {
      image(img4, 0, 0, width, height);
      nfound = true;
      used4 = true;
      i++;
      navycounter++;
      LastNavyCard = "CP9";
      LastNavyCardImage = img4;
    }
    else if(NavyDeckArray[i] == 5  && nfound == false  && used5 == false)
    {
      image(img5, 0, 0, width, height);
      nfound = true;
      used5 = true;
      i++;
      navycounter++;
      LastNavyCard = "Sengoku & Garp Prime";
      LastNavyCardImage = img5;
    }
    else if(NavyDeckArray[i] == 6  && nfound == false  && used6 == false)
    {
      image(img6, 0, 0, width, height);
      nfound = true;
      used6 = true;
      i++;
      navycounter++;
      LastNavyCard = "Sengoku & Garp Present";
      LastNavyCardImage = img6;
    }
    else if(NavyDeckArray[i] == 7  && nfound == false  && used7 == false)
    {
      image(img7, 0, 0, width, height);
      nfound = true;
      used7 = true;
      i++;
      navycounter++;
      LastNavyCard = "Dracule Mihawk";
      LastNavyCardImage = img7;
    }
    else if(NavyDeckArray[i] == 8  && nfound == false  && used8 == false)
    {
      image(img8, 0, 0, width, height);
      nfound = true;
      used8 = true;
      i++;
      navycounter++;
      LastNavyCard = "Boa Hancock";
      LastNavyCardImage = img8;
    }
    else if(NavyDeckArray[i] == 9  && nfound == false  && used9 == false)
    {
      image(img9, 0, 0, width, height);
      nfound = true;
      used9 = true;
      i++;
      navycounter++;
      LastNavyCard = "Road Poneglyph";
      LastNavyCardImage = img9;
    }
    else if(NavyDeckArray[i] == 10  && nfound == false  && used10 == false)
    {
      image(img10, 0, 0, width, height);
      nfound = true;
      used10 = true;
      i++;
      navycounter++;
      LastNavyCard = "Road Poneglyph";
      LastNavyCardImage = img10;
    }
    else if(NavyDeckArray[i] == 11  && nfound == false  && used11 == false)
    {
      image(img11, 0, 0, width, height);
      nfound = true;
      used11 = true;
      i++;
      navycounter++;
      LastNavyCard = "Battle of Marineford";
      LastNavyCardImage = img11;
    }
    else if(NavyDeckArray[i] == 12  && nfound == false  && used12 == false)
    {
      image(img12, 0, 0, width, height);
      nfound = true;
      used12 = true;
      i++;
      navycounter++;
      LastNavyCard = "Fujitora";
      LastNavyCardImage = img12;
    }
    else if(NavyDeckArray[i] == 13  && nfound == false  && used13 == false)
    {
      image(img13, 0, 0, width, height);
      nfound = true;
      used13 = true;
      i++;
      navycounter++;
      LastNavyCard = "The Five Elder Stars";
      LastNavyCardImage = img13;
    }
    else if(NavyDeckArray[i] == 14  && nfound == false  && used14 == false)
    {
      image(img14, 0, 0, width, height);
      nfound = true;
      used14 = true;
      i++;
      navycounter++;
      LastNavyCard = "Transporting Prisoners";
      LastNavyCardImage = img14;
    }
     else if(NavyDeckArray[i] == 15  && nfound == false  && used15 == false)
    {
      image(img15, 0, 0, width, height);
      nfound = true;
      used15 = true;
      i++;
      navycounter++;
      LastNavyCard = "Transponder Snail";
      LastNavyCardImage = img15;
    }
  }
  }
}

public void PhaseIVGenerator()
{
  if(pgenerate == true)
  {
  for(int j = 0; j < 20; j++)
  {
    if(PhaseIVarray[j] == 1 && pfound == false  && use1 == false)
    {
      image(im1, 0, 0, width, height);
      pfound = true;
      use1 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Akainu";
      LastPhaseIVCardImage = im1;
    }
    else if(PhaseIVarray[j] == 2  && pfound == false  && use2 == false)
    {
      image(im2, 0, 0, width, height);
      pfound = true;
      use2 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Foxy";
      LastPhaseIVCardImage = im2;
    }
    else if(PhaseIVarray[j] == 3  && pfound == false  && use3 == false)
    {
      image(im3, 0, 0, width, height);
      pfound = true;
      use3 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Aokoji";
      LastPhaseIVCardImage = im3;
    }
    else if(PhaseIVarray[j] == 4  && pfound == false  && use4 == false)
    {
      image(im4, 0, 0, width, height);
      pfound = true;
      use4 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Doffy";
      LastPhaseIVCardImage = im4;
    }
    else if(PhaseIVarray[j] == 5  && pfound == false  && use5 == false)
    {
      image(im5, 0, 0, width, height);
      pfound = true;
      use5 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Pirate King";
      LastPhaseIVCardImage = im5;
    }
    else if(PhaseIVarray[j] == 6  && pfound == false  && use6 == false)
    {
      image(im6, 0, 0, width, height);
      pfound = true;
      use6 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Shodai Owner";
      LastPhaseIVCardImage = im6;
    }
    else if(PhaseIVarray[j] == 7  && pfound == false  && use7 == false)
    {
      image(im7, 0, 0, width, height);
      pfound = true;
      use7 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Emperor";
      LastPhaseIVCardImage = im7;
    }
    else if(PhaseIVarray[j] == 8  && pfound == false  && use8 == false)
    {
      image(im8, 0, 0, width, height);
      pfound = true;
      use8 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Kaido";
      LastPhaseIVCardImage = im8;
    }
    else if(PhaseIVarray[j] == 9  && pfound == false  && use9 == false)
    {
      image(im9, 0, 0, width, height);
      pfound = true;
      use9 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Road Poneglyph";
      LastPhaseIVCardImage = im9;
    }
    else if(PhaseIVarray[j] == 10  && pfound == false  && use10 == false)
    {
      image(im10, 0, 0, width, height);
      pfound = true;
      use10 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Buggy Sama";
      LastPhaseIVCardImage = im10;
    }
    else if(PhaseIVarray[j] == 11  && pfound == false  && use11 == false)
    {
      image(im11, 0, 0, width, height);
      pfound = true;
      use11 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Road Poneglyph";
      LastPhaseIVCardImage = im11;
    }
    else if(PhaseIVarray[j] == 12  && pfound == false  && use12 == false)
    {
      image(im12, 0, 0, width, height);
      pfound = true;
      use12 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Set Sail";
      LastPhaseIVCardImage = im12;
    }
    else if(PhaseIVarray[j] == 13  && pfound == false  && use13 == false)
    {
      image(im13, 0, 0, width, height);
      pfound = true;
      use13 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Set Sail";
      LastPhaseIVCardImage = im13;
    }
    else if(PhaseIVarray[j] == 14  && pfound == false  && use14 == false)
    {
      image(im14, 0, 0, width, height);
      pfound = true;
      use14 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Set Sail";
      LastPhaseIVCardImage = im14;
    }
    else if(PhaseIVarray[j] == 15  && pfound == false  && use15 == false)
    {
      image(im15, 0, 0, width, height);
      pfound = true;
      use15 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Set Sail";
      LastPhaseIVCardImage = im15;
    }
    else if(PhaseIVarray[j] == 16  && pfound == false  && use16 == false)
    {
      image(im16, 0, 0, width, height);
      pfound = true;
      use16 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "World Noble";
      LastPhaseIVCardImage = im16;
    }
    else if(PhaseIVarray[j] == 17  && pfound == false  && use17 == false)
    {
      image(im17, 0, 0, width, height);
      pfound = true;
      use17 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Notorious Pirate";
      LastPhaseIVCardImage = im17;
    }
     else if(PhaseIVarray[j] == 18  && pfound == false  && use18 == false)
    {
      image(im18, 0, 0, width, height);
      pfound = true;
      use18 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Navy Tension";
      LastPhaseIVCardImage = im18;
    }
     else if(PhaseIVarray[j] == 19  && pfound == false  && use19 == false)
    {
      image(im19, 0, 0, width, height);
      pfound = true;
      use19 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Set Sail";
      LastPhaseIVCardImage = im19;
    }
    else if(PhaseIVarray[j] == 20  && pfound == false  && use20 == false)
    {
      image(im20, 0, 0, width, height);
      pfound = true;
      use20 = true;
      j++;
      phasecounter++;
      LastPhaseIVCard = "Worst Generation";
      LastPhaseIVCardImage = im20;
    }
  }
  }
}

public void ContinentGenerator()
{
  if(cgenerate == true)
  {
  for(int k = 0; k < 12; k++)
  {
    if(Continentarray[k] == 1 && cfound == false  && us1 == false)
    {
      image(i1, 0, 0, width, height);
      cfound = true;
      us1 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Skypiea";
      ContinentRules = SkypieaRules;
    }
    else if(Continentarray[k] == 2 && cfound == false  && us2 == false)
    {
      image(i2, 0, 0, width, height);
      cfound = true;
      us2 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Fishman Island";
      ContinentRules = FishmanRules;
    }
    else if(Continentarray[k] == 3 && cfound == false  && us3 == false)
    {
      image(i3, 0, 0, width, height);
      cfound = true;
      us3 = true;
      k++;
      continentcounter++;
      LastContinentCard = "New World"; 
      ContinentRules = NewWorldRules;
    }
    else if(Continentarray[k] == 4 && cfound == false  && us4 == false)
    {
      image(i4, 0, 0, width, height);
      cfound = true;
      us4 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Punk Hazard";
      ContinentRules = PunkHazardRules;
    }
    else if(Continentarray[k] == 5 && cfound == false  && us5 == false)
    {
      image(i5, 0, 0, width, height);
      cfound = true;
      us5 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Water Seven";
      ContinentRules = WaterSevenRules;
    }
    else if(Continentarray[k] == 6 && cfound == false  && us6 == false)
    {
      image(i6, 0, 0, width, height);
      cfound = true;
      us6 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Sabaody";
      ContinentRules = SabaodyRules;
    }
    else if(Continentarray[k] == 7 && cfound == false  && us7 == false)
    {
      image(i7, 0, 0, width, height);
      cfound = true;
      us7 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Whole Cake Island";
      ContinentRules = WholeCakeRules;
    }
    else if(Continentarray[k] == 8 && cfound == false  && us8 == false)
    {
      image(i8, 0, 0, width, height);
      cfound = true;
      us8 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Grand Line";
      ContinentRules = GrandLineRules;
    }
    else if(Continentarray[k] == 9 && cfound == false  && us9 == false)
    {
      image(i9, 0, 0, width, height);
      cfound = true;
      us9 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Enies Lobby";
      ContinentRules = EniesLobbyRules;
    }
    else if(Continentarray[k] == 10 && cfound == false  && us10 == false)
    {
      image(i10, 0, 0, width, height);
      cfound = true;
      us10 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Impel Down";
      ContinentRules = ImpelDownRules;
    }
    else if(Continentarray[k] == 11 && cfound == false  && us11 == false)
    {
      image(i11, 0, 0, width, height);
      cfound = true;
      us11 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Marineford";
      ContinentRules = MarineFordRules;
    }
    else if(Continentarray[k] == 12 && cfound == false  && us12 == false)
    {
      image(i12, 0, 0, width, height);
      cfound = true;
      us12 = true;
      k++;
      continentcounter++;
      LastContinentCard = "Land of Wano";
      ContinentRules = LandOfWanoRules;
    }
   }
  }
}

public void Raftel()
{
  LastContinentCard = "Raftel";
  ContinentRules = RaftelRules;
  PlayerBounties = false;
  IPB = false;
  image(i13, 0, 0, width, height);
}

public void NavyDeckRandomizer()
{
  shuffleArray(NavyDeckArray);
}

public void NavyReshuffler()
{
  used1 = false;
  used2 = false;
  used3 = false;
  used4 = false;
  used5 = false;
  used6 = false;
  used7 = false;
  used8 = false;
  used9 = false;
  used10 = false;
  used11 = false;
  used12 = false;
  used13 = false;
  used14 = false;
  used15 = false;
}

public void PhaseIVRandomizer()
{
  shuffleArray(PhaseIVarray);
}

public void PhaseIVReshuffler()
{
  use1 = false;
  use2 = false;
  use3 = false;
  use4 = false;
  use5 = false;
  use6 = false;
  use7 = false;
  use8 = false;
  use9 = false;
  use10 = false;
  use11 = false;
  use12 = false;
  use13 = false;
  use14 = false;
  use15 = false;
  use16 = false;
  use17 = false;
  use18 = false;
  use19 = false;
}

public void ContinentRandomizer()
{
  shuffleArray(Continentarray);
}

public void ContinentReshuffler()
{
  us1 = false;
  us2 = false;
  us3 = false;
  us4 = false;
  us5 = false;
  us6 = false;
  us7 = false;
  us8 = false;
  us9 = false;
  us10 = false;
  us11 = false;
  us12 = false;
}

public void shuffleArray(int[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
  
public void keyPressed()
{
  switch(key)
  {
    case 'n':
      mainmenu = false;
      PlayerBounties = false;
      IPB = false;
      DisplayRButton = false;
      ngenerate = true;
      nfound = false;
      background(0);
      NavyDeckGenerator();
      break;
    case 'p':
      mainmenu = false;
      PlayerBounties = false;
      IPB = false;
      DisplayRButton = false;
      pgenerate = true;
      pfound = false;
      background(0);
      PhaseIVGenerator();
      break;
    case 'c':
      mainmenu = false;
      PlayerBounties = false;
      IPB = false;
      DisplayRButton = false;
      cgenerate = true;
      cfound = false;
      background(0);
      ContinentGenerator();
      break;
    case 'b':
     if(navycounter == 14)
     {
       navycounter = 0;
       MainMenu();
     }
     if(phasecounter == 17)
     {
       phasecounter = 0;
       MainMenu();
     }
      if(continentcounter == 11)
      {
       continentcounter = 0;
       MainMenu();
      }
      PlayerBounties = true;
      DisplayRButton = true;
      mainmenu = true;
      MainMenu();
      break;
    case 's':
      if(navycounter == 0)
      {
        NavyReshuffler();
        NavyDeckRandomizer();
      }
      break;
    case 'm':
      if(phasecounter == 0)
      {
        PhaseIVReshuffler();
        PhaseIVRandomizer();
      }
      break;
    case 'o':
      if(continentcounter == 0)
      {
        ContinentReshuffler();
        ContinentRandomizer();
      }
      break;
   
    //BountyControl
    case '1':
    if(PlayerBounties == false)
    {
      YousifBounty += 100;
      PlayerStats();
      IPB = true;
      if((YousifBounty / 5) - YSubcount == zero)
      {
        YSubcount += 100;
        NavyAttackCount += 1;
        IPB = false;
        image(NavyAttack, 0, 0, width, height);
      }
    }
      break;
    case '2':
    if(PlayerBounties == false)
    {
      ShawnBounty += 100;
      PlayerStats();
      IPB = true;
      if((ShawnBounty / 5) - SSubcount == zero)
      {  
        SSubcount += 100;
        NavyAttackCount += 1;
        IPB = false;
        image(NavyAttack, 0, 0, width, height);
      }
    }
      break;
    case '3':
    if(PlayerBounties == false)
    {
      MohsinBounty += 100;
      PlayerStats();
      IPB = true;
      if((MohsinBounty / 5) - MSubcount == zero)
      {
        MSubcount += 100;
        NavyAttackCount += 1;
        IPB = false;
        image(NavyAttack, 0, 0, width, height);
      }
    }
      break;
    case '4':
    if(PlayerBounties == false)
    {
      AmeenBounty += 100;
      PlayerStats();
      IPB = true;
      if((AmeenBounty / 5) - ASubcount == zero)
      {
        ASubcount += 100;
        NavyAttackCount += 1;
        IPB = false;
        image(NavyAttack, 0, 0, width, height);
      }
    }
      break;  
    case 'r':
      if(PlayerBounties == false)
      {
        YSubcount = 100;
        SSubcount = 100;
        MSubcount = 100;
        ASubcount = 100;
        YousifBounty = 0;
        ShawnBounty = 0;
        MohsinBounty = 0;
        AmeenBounty = 0;
        PlayerStats();
      }
  }
}
  public void settings() {  size(displayWidth, displayHeight); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OnePieceGOT" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
