package Vistas;

import Conexiones.Accionar;
import Conexiones.Ingresar;
import boletos.Boletos;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EscenarioController implements Initializable {

    @FXML
    private RadioButton bot;
    @FXML
    private RadioButton bot1; @FXML private RadioButton bot2; @FXML private RadioButton bot3; @FXML private RadioButton bot4; @FXML private RadioButton bot5;
    @FXML 
    private RadioButton bot6; @FXML private RadioButton bot7; @FXML private RadioButton bot8; @FXML private RadioButton bot9; @FXML private RadioButton bot10;
    @FXML
    private RadioButton bot11; @FXML private RadioButton bot12; @FXML private RadioButton bot13; @FXML private RadioButton bot14; @FXML private RadioButton bot15;
    @FXML
    private RadioButton bot16; @FXML private RadioButton bot17; @FXML private RadioButton bot18; @FXML private RadioButton bot19; @FXML private RadioButton bot20;
    @FXML 
    private RadioButton bot21; @FXML private RadioButton bot22; @FXML private RadioButton bot23; @FXML private RadioButton bot24; @FXML private RadioButton bot25;
    @FXML
    private RadioButton bot26; @FXML private RadioButton bot27; @FXML private RadioButton bot28; @FXML private RadioButton bot29; @FXML private RadioButton bot30;
    @FXML
    private RadioButton bot31; @FXML private RadioButton bot32; @FXML private RadioButton bot33; @FXML private RadioButton bot34; @FXML private RadioButton bot35;
    @FXML
    private RadioButton bot36; @FXML private RadioButton bot37; @FXML private RadioButton bot38; @FXML private RadioButton bot39; @FXML private RadioButton bot40;
    @FXML
    private RadioButton bot41; @FXML private RadioButton bot42; @FXML private RadioButton bot43; @FXML private RadioButton bot44; @FXML private RadioButton bot45;
    @FXML
    private RadioButton bot46; @FXML private RadioButton bot47; @FXML private RadioButton bot48; @FXML private RadioButton bot49; @FXML private RadioButton bot50;
    @FXML
    private RadioButton bot51; @FXML private RadioButton bot52; @FXML private RadioButton bot53; @FXML private RadioButton bot54; @FXML private RadioButton bot55;
    @FXML
    private RadioButton bot56; @FXML private RadioButton bot57; @FXML private RadioButton bot58; @FXML private RadioButton bot59; @FXML private RadioButton bot60;
    @FXML
    private RadioButton bot61; @FXML private RadioButton bot62; @FXML private RadioButton bot63; @FXML private RadioButton bot64; @FXML private RadioButton bot65;
    @FXML
    private RadioButton bot66; @FXML private RadioButton bot67; @FXML private RadioButton bot68; @FXML private RadioButton bot69; @FXML private RadioButton bot70;
    @FXML
    private RadioButton bot71; @FXML private RadioButton bot72; @FXML private RadioButton bot73; @FXML private RadioButton bot74; @FXML private RadioButton bot75;
    @FXML 
    private RadioButton bot76; @FXML private RadioButton bot77; @FXML private RadioButton bot78; @FXML private RadioButton bot79; @FXML private RadioButton bot80;
    @FXML
    private RadioButton bot81; @FXML private RadioButton bot82; @FXML private RadioButton bot83; @FXML private RadioButton bot84; @FXML private RadioButton bot85;
    @FXML
    private RadioButton bot86; @FXML private RadioButton bot87; @FXML private RadioButton bot88; @FXML private RadioButton bot89; @FXML private RadioButton bot90;
    @FXML 
    private RadioButton bot91; @FXML private RadioButton bot92; @FXML private RadioButton bot93; @FXML private RadioButton bot94; @FXML private RadioButton bot95;
    @FXML
    private RadioButton bot96; @FXML private RadioButton bot97; @FXML private RadioButton bot98; @FXML private RadioButton bot99; @FXML private RadioButton bot100;
    @FXML
    private RadioButton bot101; @FXML private RadioButton bot102; @FXML private RadioButton bot103; @FXML private RadioButton bot104; @FXML private RadioButton bot105;
    @FXML
    private RadioButton bot106; @FXML private RadioButton bot107; @FXML private RadioButton bot108; @FXML private RadioButton bot109; @FXML private RadioButton bot110;
    @FXML
    private RadioButton bot111; @FXML private RadioButton bot112; @FXML private RadioButton bot113; @FXML private RadioButton bot114; @FXML private RadioButton bot115;
    @FXML
    private RadioButton bot116; @FXML private RadioButton bot117; @FXML private RadioButton bot118; @FXML private RadioButton bot119; @FXML private RadioButton bot120;
    @FXML
    private RadioButton bot121; @FXML private RadioButton bot122; @FXML private RadioButton bot123; @FXML private RadioButton bot124; @FXML private RadioButton bot125;
    @FXML
    private RadioButton bot126; @FXML private RadioButton bot127; @FXML private RadioButton bot128; @FXML private RadioButton bot129; @FXML private RadioButton bot130;
    @FXML
    private RadioButton bot131; @FXML private RadioButton bot132; @FXML private RadioButton bot133; @FXML private RadioButton bot134; @FXML private RadioButton bot135;
    @FXML
    private RadioButton bot136; @FXML private RadioButton bot137; @FXML private RadioButton bot138; @FXML private RadioButton bot139; @FXML private RadioButton bot140;
    @FXML
    private RadioButton bot141; @FXML private RadioButton bot142; @FXML private RadioButton bot143; @FXML private RadioButton bot144; @FXML private RadioButton bot145;
    @FXML
    private RadioButton bot146; @FXML private RadioButton bot147; @FXML private RadioButton bot148; @FXML private RadioButton bot149; @FXML private RadioButton bot150;
    @FXML
    private RadioButton bot151; @FXML private RadioButton bot152; @FXML private RadioButton bot153; @FXML private RadioButton bot154; @FXML private RadioButton bot155;
    @FXML
    private RadioButton bot156; @FXML private RadioButton bot157; @FXML private RadioButton bot160;
    @FXML
    private RadioButton bot161; @FXML private RadioButton bot162; @FXML private RadioButton bot163; @FXML private RadioButton bot164; @FXML private RadioButton bot165;
    @FXML
    private RadioButton bot166; @FXML private RadioButton bot167; @FXML private RadioButton bot168; @FXML private RadioButton bot169; @FXML private RadioButton bot170;
    @FXML
    private RadioButton bot171; @FXML private RadioButton bot172; @FXML private RadioButton bot173; @FXML private RadioButton bot174; @FXML private RadioButton bot175;
    @FXML
    private RadioButton bot176; @FXML private RadioButton bot177; @FXML private RadioButton bot178; @FXML private RadioButton bot179; @FXML private RadioButton bot180;
    @FXML
    private RadioButton bot181; @FXML private RadioButton bot182; @FXML private RadioButton bot183; @FXML private RadioButton bot184; @FXML private RadioButton bot185;
    @FXML
    private RadioButton bot186; @FXML private RadioButton bot187; @FXML private RadioButton bot188; @FXML private RadioButton bot189; @FXML private RadioButton bot190;
    @FXML
    private RadioButton bot191; @FXML private RadioButton bot192; @FXML private RadioButton bot193; @FXML private RadioButton bot194; @FXML private RadioButton bot195;
    @FXML
    private RadioButton bot196; @FXML private RadioButton bot197; @FXML private RadioButton bot198; @FXML private RadioButton bot199; @FXML private RadioButton bot200;
    @FXML
    private RadioButton bot201; @FXML private RadioButton bot202; @FXML private RadioButton bot203; @FXML private RadioButton bot204; @FXML private RadioButton bot205;
    @FXML
    private RadioButton bot206; @FXML private RadioButton bot207; @FXML private RadioButton bot208; @FXML private RadioButton bot209; @FXML private RadioButton bot210;
    @FXML
    private RadioButton bot211; @FXML private RadioButton bot212; @FXML private RadioButton bot213; @FXML private RadioButton bot214; @FXML private RadioButton bot215;
    @FXML
    private RadioButton bot216; @FXML private RadioButton bot217; @FXML private RadioButton bot218; @FXML private RadioButton bot219; @FXML private RadioButton bot220;
    @FXML
    private RadioButton bot221; @FXML private RadioButton bot222; @FXML private RadioButton bot223; @FXML private RadioButton bot224; @FXML private RadioButton bot225;
    @FXML
    private RadioButton bot226; @FXML private RadioButton bot227; @FXML private RadioButton bot228; @FXML private RadioButton bot229; @FXML private RadioButton bot230; 
    @FXML 
    private RadioButton bot231; @FXML private RadioButton bot232; @FXML private RadioButton bot233; @FXML private RadioButton bot234; @FXML private RadioButton bot235;
    @FXML
    private RadioButton bot236; @FXML private RadioButton bot237; @FXML private RadioButton bot238; @FXML private RadioButton bot239; @FXML private RadioButton bot240;
    @FXML
    private RadioButton bot241; @FXML private RadioButton bot242; @FXML private RadioButton bot243; @FXML private RadioButton bot244; @FXML private RadioButton bot245;
    @FXML
    private RadioButton bot246; @FXML private RadioButton bot247; @FXML private RadioButton bot248; @FXML private RadioButton bot249; @FXML private RadioButton bot250;
    @FXML
    private RadioButton bot251; @FXML private RadioButton bot252; @FXML private RadioButton bot253; @FXML private RadioButton bot254; @FXML private RadioButton bot255;
    @FXML
    private RadioButton bot256; @FXML private RadioButton bot257; @FXML private RadioButton bot258; @FXML private RadioButton bot259; @FXML private RadioButton bot260;
    @FXML
    private RadioButton bot261; @FXML private RadioButton bot262; @FXML private RadioButton bot263; @FXML private RadioButton bot264; @FXML private RadioButton bot265;
    @FXML
    private RadioButton bot266; @FXML private RadioButton bot267; @FXML private RadioButton bot268; @FXML private RadioButton bot269; @FXML private RadioButton bot270;
    @FXML
    private RadioButton bot271; @FXML private RadioButton bot272; @FXML private RadioButton bot273; @FXML private RadioButton bot274; @FXML private RadioButton bot275;
    @FXML
    private RadioButton bot276; @FXML private RadioButton bot277; @FXML private RadioButton bot278; @FXML private RadioButton bot279; @FXML private RadioButton bot280;
    @FXML
    private RadioButton bot281; @FXML private RadioButton bot282; @FXML private RadioButton bot283; @FXML private RadioButton bot284; @FXML private RadioButton bot285;
    @FXML
    private RadioButton bot286; @FXML private RadioButton bot287; @FXML private RadioButton bot288; @FXML private RadioButton bot289; @FXML private RadioButton bot290;
    @FXML
    private RadioButton bot291; @FXML private RadioButton bot292; @FXML private RadioButton bot293; @FXML private RadioButton bot294; @FXML private RadioButton bot295;
    @FXML
    private RadioButton bot296; @FXML private RadioButton bot297; @FXML private RadioButton bot298; @FXML private RadioButton bot299; @FXML private RadioButton bot300; 
    @FXML 
    private RadioButton bot301; @FXML private RadioButton bot302; @FXML private RadioButton bot303; @FXML private RadioButton bot304; @FXML private RadioButton bot305;
    @FXML
    private RadioButton bot306; @FXML private RadioButton bot307; @FXML private RadioButton bot308; @FXML private RadioButton bot309; @FXML private RadioButton bot310;
    @FXML
    private RadioButton bot311; @FXML private RadioButton bot312; @FXML private RadioButton bot313; @FXML private RadioButton bot314; @FXML private RadioButton bot315;
    @FXML
    private RadioButton bot316; @FXML private RadioButton bot317; @FXML private RadioButton bot318; @FXML private RadioButton bot319; @FXML private RadioButton bot320;
    @FXML
    private RadioButton bot321; @FXML private RadioButton bot322; @FXML private RadioButton bot323; @FXML private RadioButton bot324; @FXML private RadioButton bot325;
    @FXML
    private RadioButton bot326; @FXML private RadioButton bot327; @FXML private RadioButton bot328; @FXML private RadioButton bot329; @FXML private RadioButton bot330;
    @FXML
    private RadioButton bot331; @FXML private RadioButton bot332; @FXML private RadioButton bot333; @FXML private RadioButton bot334; @FXML private RadioButton bot335;
    @FXML
    private RadioButton bot336; @FXML private RadioButton bot337; @FXML private RadioButton bot338; @FXML private RadioButton bot339; @FXML private RadioButton bot340;
    @FXML
    private RadioButton bot341; @FXML private RadioButton bot342; @FXML private RadioButton bot343; @FXML private RadioButton bot344; @FXML private RadioButton bot345;
    @FXML
    private RadioButton bot346; @FXML private RadioButton bot347; @FXML private RadioButton bot348; @FXML private RadioButton bot349; @FXML private RadioButton bot350;
    @FXML
    private RadioButton bot351; @FXML private RadioButton bot352; @FXML private RadioButton bot353; @FXML private RadioButton bot354; @FXML private RadioButton bot355;
    @FXML
    private RadioButton bot356; @FXML private RadioButton bot357; @FXML private RadioButton bot358; @FXML private RadioButton bot359; @FXML private RadioButton bot360;
    @FXML
    private RadioButton bot361; @FXML private RadioButton bot362; @FXML private RadioButton bot363; @FXML private RadioButton bot364; @FXML private RadioButton bot365;
    @FXML
    private RadioButton bot366; @FXML private RadioButton bot367; @FXML private RadioButton bot368; @FXML private RadioButton bot369; @FXML private RadioButton bot370;
    @FXML
    private RadioButton bot371; @FXML private RadioButton bot372; @FXML private RadioButton bot373; @FXML private RadioButton bot374; @FXML private RadioButton bot375;
    @FXML
    private RadioButton bot376; @FXML private RadioButton bot377; @FXML private RadioButton bot378; @FXML private RadioButton bot379; @FXML private RadioButton bot380;
    @FXML
    private RadioButton bot381; @FXML private RadioButton bot382; @FXML private RadioButton bot383; @FXML private RadioButton bot384; @FXML private RadioButton bot385;
    @FXML
    private RadioButton bot386; @FXML private RadioButton bot387; @FXML private RadioButton bot388; @FXML private RadioButton bot389; @FXML private RadioButton bot390;
    @FXML
    private RadioButton bot391; @FXML private RadioButton bot392; @FXML private RadioButton bot393; @FXML private RadioButton bot394; @FXML private RadioButton bot395;
    @FXML
    private RadioButton bot396; @FXML private RadioButton bot397; @FXML private RadioButton bot398; @FXML private RadioButton bot399; @FXML private RadioButton bot400;
    @FXML
    private RadioButton bot401; @FXML private RadioButton bot402; @FXML private RadioButton bot403; @FXML private RadioButton bot404; @FXML private RadioButton bot405;
    @FXML
    private RadioButton bot406; @FXML private RadioButton bot407; @FXML private RadioButton bot408; @FXML private RadioButton bot409; @FXML private RadioButton bot410;
    @FXML
    private RadioButton bot411; @FXML private RadioButton bot412; @FXML private RadioButton bot413; @FXML private RadioButton bot414; @FXML private RadioButton bot415;
    @FXML
    private RadioButton bot416; @FXML private RadioButton bot417; @FXML private RadioButton bot418; @FXML private RadioButton bot419; @FXML private RadioButton bot420;
    @FXML
    private RadioButton bot421; @FXML private RadioButton bot422; @FXML private RadioButton bot423; @FXML private RadioButton bot424; @FXML private RadioButton bot425;
    @FXML
    private RadioButton bot426; @FXML private RadioButton bot427; @FXML private RadioButton bot428; @FXML private RadioButton bot429; @FXML private RadioButton bot430;
    @FXML
    private RadioButton bot431; @FXML private RadioButton bot432; @FXML private RadioButton bot433; @FXML private RadioButton bot434; @FXML private RadioButton bot435;
    @FXML
    private RadioButton bot436; @FXML private RadioButton bot437; @FXML private RadioButton bot438; @FXML private RadioButton bot439; @FXML private RadioButton bot440; 
    @FXML 
    private RadioButton bot441; @FXML private RadioButton bot442; @FXML private RadioButton bot443; @FXML private RadioButton bot444; @FXML private RadioButton bot445;
    @FXML
    private RadioButton bot446; @FXML private RadioButton bot447; @FXML private RadioButton bot448; @FXML private RadioButton bot449; @FXML private RadioButton bot450;
    @FXML
    private RadioButton bot451; @FXML private RadioButton bot452; @FXML private RadioButton bot453; @FXML private RadioButton bot454; @FXML private RadioButton bot455;
    @FXML
    private RadioButton bot456; @FXML private RadioButton bot457; @FXML private RadioButton bot458; @FXML private RadioButton bot459; @FXML private RadioButton bot460;
    @FXML
    private RadioButton bot461; @FXML private RadioButton bot462; @FXML private RadioButton bot463; @FXML private RadioButton bot464; @FXML private RadioButton bot465;
    @FXML
    private RadioButton bot466; @FXML private RadioButton bot467; @FXML private RadioButton bot468; @FXML private RadioButton bot469; @FXML private RadioButton bot470;
    @FXML
    private RadioButton bot471; @FXML private RadioButton bot472; @FXML private RadioButton bot473; @FXML private RadioButton bot474; @FXML private RadioButton bot475;
    @FXML
    private RadioButton bot476; @FXML private RadioButton bot477; @FXML private RadioButton bot478; @FXML private RadioButton bot479; @FXML private RadioButton bot480;
    @FXML
    private RadioButton bot481; @FXML private RadioButton bot482; @FXML private RadioButton bot483; @FXML private RadioButton bot484; @FXML private RadioButton bot485;
    @FXML
    private RadioButton bot486; @FXML private RadioButton bot487; @FXML private RadioButton bot488; @FXML private RadioButton bot489; @FXML private RadioButton bot490;
    @FXML
    private RadioButton bot491; @FXML private RadioButton bot492; @FXML private RadioButton bot493; @FXML private RadioButton bot494; @FXML private RadioButton bot495;
    @FXML
    private RadioButton bot496; @FXML private RadioButton bot497; @FXML private RadioButton bot498; @FXML private RadioButton bot499; @FXML private RadioButton bot500;
    @FXML
    private RadioButton bot501; @FXML private RadioButton bot502; @FXML private RadioButton bot503; @FXML private RadioButton bot504; @FXML private RadioButton bot505;
    @FXML
    private RadioButton bot506; @FXML private RadioButton bot507; @FXML private RadioButton bot508; @FXML private RadioButton bot509; @FXML private RadioButton bot510;
    @FXML
    private RadioButton bot511; @FXML private RadioButton bot512; @FXML private RadioButton bot513; @FXML private RadioButton bot514; @FXML private RadioButton bot515;
    @FXML
    private RadioButton bot516; @FXML private RadioButton bot517; @FXML private RadioButton bot518; @FXML private RadioButton bot519; @FXML private RadioButton bot520;
    @FXML
    private RadioButton bot521; @FXML private RadioButton bot522; @FXML private RadioButton bot523; @FXML private RadioButton bot524; @FXML private RadioButton bot525;
    @FXML
    private RadioButton bot526; @FXML private RadioButton bot527; @FXML private RadioButton bot528; @FXML private RadioButton bot529; @FXML private RadioButton bot530;
    @FXML
    private RadioButton bot531; @FXML private RadioButton bot532; @FXML private RadioButton bot533; @FXML private RadioButton bot534; @FXML private RadioButton bot535;
    @FXML
    private RadioButton bot536; @FXML private RadioButton bot537; @FXML private RadioButton bot538; @FXML private RadioButton bot539; @FXML private RadioButton bot540;
    @FXML
    private RadioButton bot541; @FXML private RadioButton bot542; @FXML private RadioButton bot543; @FXML private RadioButton bot544; @FXML private RadioButton bot545;
    @FXML
    private RadioButton bot546; @FXML private RadioButton bot547; @FXML private RadioButton bot548; @FXML private RadioButton bot549; @FXML private RadioButton bot550;
    @FXML
    private RadioButton bot551; @FXML private RadioButton bot552; @FXML private RadioButton bot553; @FXML private RadioButton bot554; @FXML private RadioButton bot555;
    @FXML
    private RadioButton bot556; @FXML private RadioButton bot557; @FXML private RadioButton bot558; @FXML private RadioButton bot559; @FXML private RadioButton bot560;
    @FXML
    private RadioButton bot561; @FXML private RadioButton bot562; @FXML private RadioButton bot563; @FXML private RadioButton bot564; @FXML private RadioButton bot565;
    @FXML
    private RadioButton bot566; @FXML private RadioButton bot567; @FXML private RadioButton bot568; @FXML private RadioButton bot569; @FXML private RadioButton bot570;
    @FXML
    private RadioButton bot571; @FXML private RadioButton bot572; @FXML private RadioButton bot573; @FXML private RadioButton bot574; @FXML private RadioButton bot575;
    @FXML
    private RadioButton bot576; @FXML private RadioButton bot577; @FXML private RadioButton bot578; @FXML private RadioButton bot579; @FXML private RadioButton bot580;
    @FXML
    private RadioButton bot581; @FXML private RadioButton bot582; @FXML private RadioButton bot583; @FXML private RadioButton bot584; @FXML private RadioButton bot585;
    @FXML
    private RadioButton bot586; @FXML private RadioButton bot587; @FXML private RadioButton bot588; @FXML private RadioButton bot589; @FXML private RadioButton bot590;
    @FXML
    private RadioButton bot591; @FXML private RadioButton bot592; @FXML private RadioButton bot593; @FXML private RadioButton bot594; @FXML private RadioButton bot595;
    @FXML
    private RadioButton bot596; @FXML private RadioButton bot597;
    @FXML
    private Button r;
    @FXML
    private Button con;
    
    public static String Bot=null;
    public static String Nom=null;
    public static String Din=null;
    boolean Seleccionar=false;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }    
    @FXML
    private void regresar(ActionEvent event) {
         Stage stage= (Stage) this.r.getScene().getWindow();
	stage.close();    }
    @FXML
    private void confirmar(ActionEvent event) {
        Ingresar ingresar=new Ingresar();
   
          if(bot.isSelected()==true){Bot="Ocupado"; Nom="A1"; Din="Q.150";Seleccionar=true;}
          if(bot1.isSelected()==true){Bot="Ocupado"; Nom="A2"; Din="Q.150";Seleccionar=true;}
          if(bot2.isSelected()==true){Bot="Ocupado"; Nom="A3"; Din="Q.150";Seleccionar=true;}
          if(bot3.isSelected()==true){Bot="Ocupado"; Nom="A4"; Din="Q.150";Seleccionar=true;}
          if(bot4.isSelected()==true){Bot="Ocupado"; Nom="A5"; Din="Q.150";Seleccionar=true;}
          if(bot5.isSelected()==true){Bot="Ocupado"; Nom="A6"; Din="Q.150";Seleccionar=true;}
          if(bot6.isSelected()==true){Bot="Ocupado"; Nom="B1"; Din="Q.150";Seleccionar=true;}
          if(bot7.isSelected()==true){Bot="Ocupado"; Nom="B2"; Din="Q.150";Seleccionar=true;}
          if(bot8.isSelected()==true){Bot="Ocupado"; Nom="B3"; Din="Q.150";Seleccionar=true;}
          if(bot9.isSelected()==true){Bot="Ocupado"; Nom="B4"; Din="Q.150";Seleccionar=true;}
          if(bot10.isSelected()==true){Bot="Ocupado"; Nom="B5"; Din="Q.150";Seleccionar=true;}
          if(bot11.isSelected()==true){Bot="Ocupado"; Nom="B6"; Din="Q.150";Seleccionar=true;}
          if(bot12.isSelected()==true){Bot="Ocupado"; Nom="B7"; Din="Q.150";Seleccionar=true;}
          if(bot13.isSelected()==true){Bot="Ocupado"; Nom="C1"; Din="Q.150";Seleccionar=true;}
          if(bot14.isSelected()==true){Bot="Ocupado"; Nom="C2"; Din="Q.150";Seleccionar=true;}
          if(bot15.isSelected()==true){Bot="Ocupado"; Nom="C3"; Din="Q.150";Seleccionar=true;}
          if(bot16.isSelected()==true){Bot="Ocupado"; Nom="C4"; Din="Q.150";Seleccionar=true;}
          if(bot17.isSelected()==true){Bot="Ocupado"; Nom="C5"; Din="Q.150";Seleccionar=true;}
          if(bot18.isSelected()==true){Bot="Ocupado"; Nom="C6"; Din="Q.150";Seleccionar=true;}
          if(bot19.isSelected()==true){Bot="Ocupado"; Nom="C7"; Din="Q.150";Seleccionar=true;}
          if(bot20.isSelected()==true){Bot="Ocupado"; Nom="C8"; Din="Q.150";Seleccionar=true;}
          if(bot21.isSelected()==true){Bot="Ocupado"; Nom="D1"; Din="Q.100";Seleccionar=true;}
          if(bot22.isSelected()==true){Bot="Ocupado"; Nom="D2"; Din="Q.100";Seleccionar=true;}
          if(bot23.isSelected()==true){Bot="Ocupado"; Nom="D3"; Din="Q.100";Seleccionar=true;}
          if(bot24.isSelected()==true){Bot="Ocupado"; Nom="D4"; Din="Q.100";Seleccionar=true;}
          if(bot25.isSelected()==true){Bot="Ocupado"; Nom="D5"; Din="Q.100";Seleccionar=true;}
          if(bot26.isSelected()==true){Bot="Ocupado"; Nom="D6"; Din="Q.100";Seleccionar=true;}
          if(bot27.isSelected()==true){Bot="Ocupado"; Nom="D7"; Din="Q.100";Seleccionar=true;}
          if(bot28.isSelected()==true){Bot="Ocupado"; Nom="D8"; Din="Q.100";Seleccionar=true;}
          if(bot29.isSelected()==true){Bot="Ocupado"; Nom="D9"; Din="Q.100";Seleccionar=true;}
          if(bot30.isSelected()==true){Bot="Ocupado"; Nom="E1"; Din="Q.100";Seleccionar=true;}
          if(bot31.isSelected()==true){Bot="Ocupado"; Nom="E2"; Din="Q.100";Seleccionar=true;}
          if(bot32.isSelected()==true){Bot="Ocupado"; Nom="E3"; Din="Q.100";Seleccionar=true;}
          if(bot33.isSelected()==true){Bot="Ocupado"; Nom="E4"; Din="Q.100";Seleccionar=true;}
          if(bot34.isSelected()==true){Bot="Ocupado"; Nom="E5"; Din="Q.100";Seleccionar=true;}
          if(bot35.isSelected()==true){Bot="Ocupado"; Nom="E6"; Din="Q.100";Seleccionar=true;}
          if(bot36.isSelected()==true){Bot="Ocupado"; Nom="E7"; Din="Q.100";Seleccionar=true;}
          if(bot37.isSelected()==true){Bot="Ocupado"; Nom="E8"; Din="Q.100";Seleccionar=true;}
          if(bot38.isSelected()==true){Bot="Ocupado"; Nom="E9"; Din="Q.100";Seleccionar=true;}
          if(bot39.isSelected()==true){Bot="Ocupado"; Nom="E10"; Din="Q.100";Seleccionar=true;}
          if(bot40.isSelected()==true){Bot="Ocupado"; Nom="F1"; Din="Q.100";Seleccionar=true;}
          if(bot41.isSelected()==true){Bot="Ocupado"; Nom="F2"; Din="Q.100";Seleccionar=true;}
          if(bot42.isSelected()==true){Bot="Ocupado"; Nom="F3"; Din="Q.100";Seleccionar=true;}
          if(bot43.isSelected()==true){Bot="Ocupado"; Nom="F4"; Din="Q.100";Seleccionar=true;}
          if(bot44.isSelected()==true){Bot="Ocupado"; Nom="F5"; Din="Q.100";Seleccionar=true;}
          if(bot45.isSelected()==true){Bot="Ocupado"; Nom="F6"; Din="Q.100";Seleccionar=true;}
          if(bot46.isSelected()==true){Bot="Ocupado"; Nom="F7"; Din="Q.100";Seleccionar=true;}
          if(bot47.isSelected()==true){Bot="Ocupado"; Nom="F8"; Din="Q.100";Seleccionar=true;}
          if(bot48.isSelected()==true){Bot="Ocupado"; Nom="F9"; Din="Q.100";Seleccionar=true;}
          if(bot49.isSelected()==true){Bot="Ocupado"; Nom="F10"; Din="Q.100";Seleccionar=true;}
          if(bot50.isSelected()==true){Bot="Ocupado"; Nom="F11"; Din="Q.100";Seleccionar=true;}
          if(bot51.isSelected()==true){Bot="Ocupado"; Nom="G1"; Din="Q.100";Seleccionar=true;}
          if(bot52.isSelected()==true){Bot="Ocupado"; Nom="G2"; Din="Q.100";Seleccionar=true;}
          if(bot53.isSelected()==true){Bot="Ocupado"; Nom="G3"; Din="Q.100";Seleccionar=true;}
          if(bot54.isSelected()==true){Bot="Ocupado"; Nom="G4"; Din="Q.100";Seleccionar=true;}
          if(bot55.isSelected()==true){Bot="Ocupado"; Nom="G5"; Din="Q.100";Seleccionar=true;}
          if(bot56.isSelected()==true){Bot="Ocupado"; Nom="G6"; Din="Q.100";Seleccionar=true;}
          if(bot57.isSelected()==true){Bot="Ocupado"; Nom="G7"; Din="Q.100";Seleccionar=true;}
          if(bot58.isSelected()==true){Bot="Ocupado"; Nom="G8"; Din="Q.100";Seleccionar=true;}
          if(bot59.isSelected()==true){Bot="Ocupado"; Nom="G9"; Din="Q.100";Seleccionar=true;}
          if(bot60.isSelected()==true){Bot="Ocupado"; Nom="G10"; Din="Q.100";Seleccionar=true;}
          if(bot61.isSelected()==true){Bot="Ocupado"; Nom="G11"; Din="Q.100";Seleccionar=true;}
          if(bot62.isSelected()==true){Bot="Ocupado"; Nom="H1"; Din="Q.75";Seleccionar=true;}
          if(bot63.isSelected()==true){Bot="Ocupado"; Nom="H2"; Din="Q.75";Seleccionar=true;}
          if(bot64.isSelected()==true){Bot="Ocupado"; Nom="H3"; Din="Q.75";Seleccionar=true;}
          if(bot65.isSelected()==true){Bot="Ocupado"; Nom="H4"; Din="Q.75";Seleccionar=true;}
          if(bot66.isSelected()==true){Bot="Ocupado"; Nom="H5"; Din="Q.75";Seleccionar=true;}
          if(bot67.isSelected()==true){Bot="Ocupado"; Nom="H6"; Din="Q.75";Seleccionar=true;}
          if(bot68.isSelected()==true){Bot="Ocupado"; Nom="H7"; Din="Q.75";Seleccionar=true;}
          if(bot69.isSelected()==true){Bot="Ocupado"; Nom="H8"; Din="Q.75";Seleccionar=true;}
          if(bot70.isSelected()==true){Bot="Ocupado"; Nom="H9"; Din="Q.75";Seleccionar=true;}
          if(bot71.isSelected()==true){Bot="Ocupado"; Nom="H10"; Din="Q.75";Seleccionar=true;}
          if(bot72.isSelected()==true){Bot="Ocupado"; Nom="H11"; Din="Q.75";Seleccionar=true;}
          if(bot73.isSelected()==true){Bot="Ocupado"; Nom="I1"; Din="Q.75";Seleccionar=true;}
          if(bot74.isSelected()==true){Bot="Ocupado"; Nom="I2"; Din="Q.75";Seleccionar=true;}
          if(bot75.isSelected()==true){Bot="Ocupado"; Nom="I3"; Din="Q.75";Seleccionar=true;}
          if(bot76.isSelected()==true){Bot="Ocupado"; Nom="I4"; Din="Q.75";Seleccionar=true;}
          if(bot77.isSelected()==true){Bot="Ocupado"; Nom="I5"; Din="Q.75";Seleccionar=true;}
          if(bot78.isSelected()==true){Bot="Ocupado"; Nom="I6"; Din="Q.75";Seleccionar=true;}
          if(bot79.isSelected()==true){Bot="Ocupado"; Nom="I7"; Din="Q.75";Seleccionar=true;}
          if(bot80.isSelected()==true){Bot="Ocupado"; Nom="I8"; Din="Q.75";Seleccionar=true;}
          if(bot81.isSelected()==true){Bot="Ocupado"; Nom="I9"; Din="Q.75";Seleccionar=true;}
          if(bot82.isSelected()==true){Bot="Ocupado"; Nom="I10"; Din="Q.75";Seleccionar=true;}
          if(bot83.isSelected()==true){Bot="Ocupado"; Nom="I11"; Din="Q.75";Seleccionar=true;}
          if(bot84.isSelected()==true){Bot="Ocupado"; Nom="J1"; Din="Q.75";Seleccionar=true;}
          if(bot85.isSelected()==true){Bot="Ocupado"; Nom="J2"; Din="Q.75";Seleccionar=true;}
          if(bot86.isSelected()==true){Bot="Ocupado"; Nom="J3"; Din="Q.75";Seleccionar=true;}
          if(bot87.isSelected()==true){Bot="Ocupado"; Nom="J4"; Din="Q.75";Seleccionar=true;}
          if(bot88.isSelected()==true){Bot="Ocupado"; Nom="J5"; Din="Q.75";Seleccionar=true;}
          if(bot89.isSelected()==true){Bot="Ocupado"; Nom="J6"; Din="Q.75";Seleccionar=true;}
          if(bot90.isSelected()==true){Bot="Ocupado"; Nom="J7"; Din="Q.75";Seleccionar=true;}
          if(bot91.isSelected()==true){Bot="Ocupado"; Nom="J8"; Din="Q.75";Seleccionar=true;}
          if(bot92.isSelected()==true){Bot="Ocupado"; Nom="J9"; Din="Q.75";Seleccionar=true;}
          if(bot93.isSelected()==true){Bot="Ocupado"; Nom="J10"; Din="Q.75";Seleccionar=true;}
          if(bot94.isSelected()==true){Bot="Ocupado"; Nom="J11"; Din="Q.75";Seleccionar=true;}
          if(bot95.isSelected()==true){Bot="Ocupado"; Nom="K1"; Din="Q.75";Seleccionar=true;}
          if(bot96.isSelected()==true){Bot="Ocupado"; Nom="K2"; Din="Q.75";Seleccionar=true;}
          if(bot97.isSelected()==true){Bot="Ocupado"; Nom="K3"; Din="Q.75";Seleccionar=true;}
          if(bot98.isSelected()==true){Bot="Ocupado"; Nom="K4"; Din="Q.75";Seleccionar=true;}
          if(bot99.isSelected()==true){Bot="Ocupado"; Nom="K5"; Din="Q.75";Seleccionar=true;}
          if(bot100.isSelected()==true){Bot="Ocupado"; Nom="K6"; Din="Q.75";Seleccionar=true;}
          if(bot101.isSelected()==true){Bot="Ocupado"; Nom="K7"; Din="Q.75";Seleccionar=true;}
          if(bot102.isSelected()==true){Bot="Ocupado"; Nom="K8"; Din="Q.75";Seleccionar=true;}
          if(bot103.isSelected()==true){Bot="Ocupado"; Nom="K9"; Din="Q.75";Seleccionar=true;}
          if(bot104.isSelected()==true){Bot="Ocupado"; Nom="K10"; Din="Q.75";Seleccionar=true;}
          if(bot105.isSelected()==true){Bot="Ocupado"; Nom="K11"; Din="Q.75";Seleccionar=true;}
          if(bot106.isSelected()==true){Bot="Ocupado"; Nom="L1"; Din="Q.75";Seleccionar=true;}
          if(bot107.isSelected()==true){Bot="Ocupado"; Nom="L2"; Din="Q.75";Seleccionar=true;}
          if(bot108.isSelected()==true){Bot="Ocupado"; Nom="L3"; Din="Q.75";Seleccionar=true;}
          if(bot109.isSelected()==true){Bot="Ocupado"; Nom="L4"; Din="Q.75";Seleccionar=true;}
          if(bot110.isSelected()==true){Bot="Ocupado"; Nom="L5"; Din="Q.75";Seleccionar=true;}
          if(bot111.isSelected()==true){Bot="Ocupado"; Nom="L6"; Din="Q.75";Seleccionar=true;}
          if(bot112.isSelected()==true){Bot="Ocupado"; Nom="L7"; Din="Q.75";Seleccionar=true;}
          if(bot113.isSelected()==true){Bot="Ocupado"; Nom="L8"; Din="Q.75";Seleccionar=true;}
          if(bot114.isSelected()==true){Bot="Ocupado"; Nom="L9"; Din="Q.75";Seleccionar=true;}
          if(bot115.isSelected()==true){Bot="Ocupado"; Nom="L10"; Din="Q.75";Seleccionar=true;}
          if(bot116.isSelected()==true){Bot="Ocupado"; Nom="K11"; Din="Q.75";Seleccionar=true;}
          if(bot117.isSelected()==true){Bot="Ocupado"; Nom="M1"; Din="Q.75";Seleccionar=true;}
          if(bot118.isSelected()==true){Bot="Ocupado"; Nom="M2"; Din="Q.75";Seleccionar=true;}
          if(bot119.isSelected()==true){Bot="Ocupado"; Nom="M3"; Din="Q.75";Seleccionar=true;}
          if(bot120.isSelected()==true){Bot="Ocupado"; Nom="M4"; Din="Q.75";Seleccionar=true;}
          if(bot121.isSelected()==true){Bot="Ocupado"; Nom="M5"; Din="Q.75";Seleccionar=true;}
          if(bot122.isSelected()==true){Bot="Ocupado"; Nom="M6"; Din="Q.75";Seleccionar=true;}
          if(bot123.isSelected()==true){Bot="Ocupado"; Nom="M7"; Din="Q.75";Seleccionar=true;}
          if(bot124.isSelected()==true){Bot="Ocupado"; Nom="M8"; Din="Q.75";Seleccionar=true;}
          if(bot125.isSelected()==true){Bot="Ocupado"; Nom="M9"; Din="Q.75";Seleccionar=true;}
          if(bot126.isSelected()==true){Bot="Ocupado"; Nom="M10"; Din="Q.75";Seleccionar=true;}
          if(bot127.isSelected()==true){Bot="Ocupado"; Nom="M11"; Din="Q.75";Seleccionar=true;}
          if(bot128.isSelected()==true){Bot="Ocupado"; Nom="N1"; Din="Q.75";Seleccionar=true;}
          if(bot129.isSelected()==true){Bot="Ocupado"; Nom="N2"; Din="Q.75";Seleccionar=true;}
          if(bot130.isSelected()==true){Bot="Ocupado"; Nom="N3"; Din="Q.75";Seleccionar=true;}
          if(bot131.isSelected()==true){Bot="Ocupado"; Nom="N4"; Din="Q.75";Seleccionar=true;}
          if(bot132.isSelected()==true){Bot="Ocupado"; Nom="N5"; Din="Q.75";Seleccionar=true;}
          if(bot133.isSelected()==true){Bot="Ocupado"; Nom="N6"; Din="Q.75";Seleccionar=true;}
          if(bot134.isSelected()==true){Bot="Ocupado"; Nom="N7"; Din="Q.75";Seleccionar=true;}
          if(bot135.isSelected()==true){Bot="Ocupado"; Nom="N8"; Din="Q.75";Seleccionar=true;}
          if(bot136.isSelected()==true){Bot="Ocupado"; Nom="N9"; Din="Q.75";Seleccionar=true;}
          if(bot137.isSelected()==true){Bot="Ocupado"; Nom="N10"; Din="Q.75";Seleccionar=true;}
          if(bot138.isSelected()==true){Bot="Ocupado"; Nom="N11"; Din="Q.75";Seleccionar=true;}
          if(bot139.isSelected()==true){Bot="Ocupado"; Nom="01"; Din="Q.75";Seleccionar=true;}
          if(bot140.isSelected()==true){Bot="Ocupado"; Nom="O2"; Din="Q.75";Seleccionar=true;}
          if(bot141.isSelected()==true){Bot="Ocupado"; Nom="O3"; Din="Q.75";Seleccionar=true;}
          if(bot142.isSelected()==true){Bot="Ocupado"; Nom="O4"; Din="Q.75";Seleccionar=true;}
          if(bot143.isSelected()==true){Bot="Ocupado"; Nom="O5"; Din="Q.75";Seleccionar=true;}
          if(bot144.isSelected()==true){Bot="Ocupado"; Nom="O6"; Din="Q.75";Seleccionar=true;}
          if(bot145.isSelected()==true){Bot="Ocupado"; Nom="O7"; Din="Q.75";Seleccionar=true;}
          if(bot146.isSelected()==true){Bot="Ocupado"; Nom="O8"; Din="Q.75";Seleccionar=true;}
          if(bot147.isSelected()==true){Bot="Ocupado"; Nom="O9"; Din="Q.75";Seleccionar=true;}
          if(bot148.isSelected()==true){Bot="Ocupado"; Nom="010"; Din="Q.75";Seleccionar=true;}
          if(bot149.isSelected()==true){Bot="Ocupado"; Nom="O11"; Din="Q.75";Seleccionar=true;}
          if(bot150.isSelected()==true){Bot="Ocupado"; Nom="P1"; Din="Q.75";Seleccionar=true;}
          if(bot151.isSelected()==true){Bot="Ocupado"; Nom="P2"; Din="Q.75";Seleccionar=true;}
          if(bot152.isSelected()==true){Bot="Ocupado"; Nom="P3"; Din="Q.75";Seleccionar=true;}
          if(bot153.isSelected()==true){Bot="Ocupado"; Nom="P4"; Din="Q.75";Seleccionar=true;}
          if(bot154.isSelected()==true){Bot="Ocupado"; Nom="P5"; Din="Q.75";Seleccionar=true;}
          if(bot155.isSelected()==true){Bot="Ocupado"; Nom="P6"; Din="Q.75";Seleccionar=true;}
          if(bot156.isSelected()==true){Bot="Ocupado"; Nom="P7"; Din="Q.75";Seleccionar=true;}
          if(bot157.isSelected()==true){Bot="Ocupado"; Nom="P8"; Din="Q.75";Seleccionar=true;}
          if(bot160.isSelected()==true){Bot="Ocupado"; Nom="AA1"; Din="Q.200";Seleccionar=true;}
          if(bot161.isSelected()==true){Bot="Ocupado"; Nom="AA2"; Din="Q.200";Seleccionar=true;}
          if(bot162.isSelected()==true){Bot="Ocupado"; Nom="AA3"; Din="Q.200";Seleccionar=true;}
          if(bot163.isSelected()==true){Bot="Ocupado"; Nom="AA4"; Din="Q.200";Seleccionar=true;}
          if(bot164.isSelected()==true){Bot="Ocupado"; Nom="AA5"; Din="Q.200";Seleccionar=true;}
          if(bot165.isSelected()==true){Bot="Ocupado"; Nom="AA6"; Din="Q.200";Seleccionar=true;}
          if(bot166.isSelected()==true){Bot="Ocupado"; Nom="AA7"; Din="Q.200";Seleccionar=true;}
          if(bot167.isSelected()==true){Bot="Ocupado"; Nom="AA8"; Din="Q.200";Seleccionar=true;}
          if(bot168.isSelected()==true){Bot="Ocupado"; Nom="AA9"; Din="Q.200";Seleccionar=true;}
          if(bot169.isSelected()==true){Bot="Ocupado"; Nom="AA10"; Din="Q.200";Seleccionar=true;}
          if(bot170.isSelected()==true){Bot="Ocupado"; Nom="BB1"; Din="Q.200";Seleccionar=true;}
          if(bot171.isSelected()==true){Bot="Ocupado"; Nom="BB2"; Din="Q.200";Seleccionar=true;}
          if(bot172.isSelected()==true){Bot="Ocupado"; Nom="BB3"; Din="Q.200";Seleccionar=true;}
          if(bot173.isSelected()==true){Bot="Ocupado"; Nom="BB4"; Din="Q.200";Seleccionar=true;}
          if(bot174.isSelected()==true){Bot="Ocupado"; Nom="BB5"; Din="Q.200";Seleccionar=true;}
          if(bot175.isSelected()==true){Bot="Ocupado"; Nom="BB6"; Din="Q.200";Seleccionar=true;}
          if(bot176.isSelected()==true){Bot="Ocupado"; Nom="BB7"; Din="Q.200";Seleccionar=true;}
          if(bot177.isSelected()==true){Bot="Ocupado"; Nom="BB8"; Din="Q.200";Seleccionar=true;}
          if(bot178.isSelected()==true){Bot="Ocupado"; Nom="BB9"; Din="Q.200";Seleccionar=true;}
          if(bot179.isSelected()==true){Bot="Ocupado"; Nom="BB10"; Din="Q.200";Seleccionar=true;}
          if(bot180.isSelected()==true){Bot="Ocupado"; Nom="CC1"; Din="Q.150";Seleccionar=true;}
          if(bot181.isSelected()==true){Bot="Ocupado"; Nom="CC2"; Din="Q.150";Seleccionar=true;}
          if(bot182.isSelected()==true){Bot="Ocupado"; Nom="CC3"; Din="Q.150";Seleccionar=true;}
          if(bot183.isSelected()==true){Bot="Ocupado"; Nom="CC4"; Din="Q.150";Seleccionar=true;}
          if(bot184.isSelected()==true){Bot="Ocupado"; Nom="CC5"; Din="Q.150";Seleccionar=true;}
          if(bot185.isSelected()==true){Bot="Ocupado"; Nom="CC6"; Din="Q.150";Seleccionar=true;}
          if(bot186.isSelected()==true){Bot="Ocupado"; Nom="CC7"; Din="Q.150";Seleccionar=true;}
          if(bot187.isSelected()==true){Bot="Ocupado"; Nom="CC8"; Din="Q.150";Seleccionar=true;}
          if(bot188.isSelected()==true){Bot="Ocupado"; Nom="CC9"; Din="Q.150";Seleccionar=true;}
          if(bot189.isSelected()==true){Bot="Ocupado"; Nom="CC10"; Din="Q.150";Seleccionar=true;}
          if(bot190.isSelected()==true){Bot="Ocupado"; Nom="DD1"; Din="Q.150";Seleccionar=true;}
          if(bot191.isSelected()==true){Bot="Ocupado"; Nom="DD2"; Din="Q.150";Seleccionar=true;}
          if(bot192.isSelected()==true){Bot="Ocupado"; Nom="DD3"; Din="Q.150";Seleccionar=true;}
          if(bot193.isSelected()==true){Bot="Ocupado"; Nom="DD4"; Din="Q.150";Seleccionar=true;}
          if(bot194.isSelected()==true){Bot="Ocupado"; Nom="DD5"; Din="Q.150";Seleccionar=true;}
          if(bot195.isSelected()==true){Bot="Ocupado"; Nom="DD6"; Din="Q.150";Seleccionar=true;}
          if(bot196.isSelected()==true){Bot="Ocupado"; Nom="DD7"; Din="Q.150";Seleccionar=true;}
          if(bot197.isSelected()==true){Bot="Ocupado"; Nom="DD8"; Din="Q.150";Seleccionar=true;}
          if(bot198.isSelected()==true){Bot="Ocupado"; Nom="DD9"; Din="Q.150";Seleccionar=true;}
          if(bot199.isSelected()==true){Bot="Ocupado"; Nom="DD10"; Din="Q.150";Seleccionar=true;}
          if(bot200.isSelected()==true){Bot="Ocupado"; Nom="EE1"; Din="Q.150";Seleccionar=true;}
          if(bot201.isSelected()==true){Bot="Ocupado"; Nom="EE2"; Din="Q.150";Seleccionar=true;}
          if(bot202.isSelected()==true){Bot="Ocupado"; Nom="EE3"; Din="Q.150";Seleccionar=true;}
          if(bot203.isSelected()==true){Bot="Ocupado"; Nom="EE4"; Din="Q.150";Seleccionar=true;}
          if(bot204.isSelected()==true){Bot="Ocupado"; Nom="EE5"; Din="Q.150";Seleccionar=true;}
          if(bot205.isSelected()==true){Bot="Ocupado"; Nom="EE6"; Din="Q.150";Seleccionar=true;}
          if(bot206.isSelected()==true){Bot="Ocupado"; Nom="EE7"; Din="Q.150";Seleccionar=true;}
          if(bot207.isSelected()==true){Bot="Ocupado"; Nom="EE8"; Din="Q.150";Seleccionar=true;}
          if(bot208.isSelected()==true){Bot="Ocupado"; Nom="EE9"; Din="Q.150";Seleccionar=true;}
          if(bot209.isSelected()==true){Bot="Ocupado"; Nom="EE10"; Din="Q.150";Seleccionar=true;}
          if(bot210.isSelected()==true){Bot="Ocupado"; Nom="FF1"; Din="Q.150";Seleccionar=true;}
          if(bot211.isSelected()==true){Bot="Ocupado"; Nom="FF2"; Din="Q.150";Seleccionar=true;}
          if(bot212.isSelected()==true){Bot="Ocupado"; Nom="FF3"; Din="Q.150";Seleccionar=true;}
          if(bot213.isSelected()==true){Bot="Ocupado"; Nom="FF4"; Din="Q.150";Seleccionar=true;}
          if(bot214.isSelected()==true){Bot="Ocupado"; Nom="FF5"; Din="Q.150";Seleccionar=true;}
          if(bot215.isSelected()==true){Bot="Ocupado"; Nom="FF6"; Din="Q.150";Seleccionar=true;}
          if(bot216.isSelected()==true){Bot="Ocupado"; Nom="FF7"; Din="Q.150";Seleccionar=true;}
          if(bot217.isSelected()==true){Bot="Ocupado"; Nom="FF8"; Din="Q.150";Seleccionar=true;}
          if(bot218.isSelected()==true){Bot="Ocupado"; Nom="FF9"; Din="Q.150";Seleccionar=true;}
          if(bot219.isSelected()==true){Bot="Ocupado"; Nom="FF10"; Din="Q.150";Seleccionar=true;}
          if(bot220.isSelected()==true){Bot="Ocupado"; Nom="GG1"; Din="Q.150";Seleccionar=true;}
          if(bot221.isSelected()==true){Bot="Ocupado"; Nom="GG2"; Din="Q.150";Seleccionar=true;}
          if(bot222.isSelected()==true){Bot="Ocupado"; Nom="GG3"; Din="Q.150";Seleccionar=true;}
          if(bot223.isSelected()==true){Bot="Ocupado"; Nom="GG4"; Din="Q.150";Seleccionar=true;}
          if(bot224.isSelected()==true){Bot="Ocupado"; Nom="GG5"; Din="Q.150";Seleccionar=true;}
          if(bot225.isSelected()==true){Bot="Ocupado"; Nom="GG6"; Din="Q.150";Seleccionar=true;}
          if(bot226.isSelected()==true){Bot="Ocupado"; Nom="GG7"; Din="Q.150";Seleccionar=true;}
          if(bot227.isSelected()==true){Bot="Ocupado"; Nom="GG8"; Din="Q.150";Seleccionar=true;}
          if(bot228.isSelected()==true){Bot="Ocupado"; Nom="GG9"; Din="Q.150";Seleccionar=true;}
          if(bot229.isSelected()==true){Bot="Ocupado"; Nom="GG10"; Din="Q.150";Seleccionar=true;}
          if(bot230.isSelected()==true){Bot="Ocupado"; Nom="HH1"; Din="Q.100";Seleccionar=true;}
          if(bot231.isSelected()==true){Bot="Ocupado"; Nom="HH2"; Din="Q.100";Seleccionar=true;}
          if(bot232.isSelected()==true){Bot="Ocupado"; Nom="HH3"; Din="Q.100";Seleccionar=true;}
          if(bot233.isSelected()==true){Bot="Ocupado"; Nom="HH4"; Din="Q.100";Seleccionar=true;}
          if(bot234.isSelected()==true){Bot="Ocupado"; Nom="HH5"; Din="Q.100";Seleccionar=true;}
          if(bot235.isSelected()==true){Bot="Ocupado"; Nom="HH6"; Din="Q.100";Seleccionar=true;}
          if(bot236.isSelected()==true){Bot="Ocupado"; Nom="HH7"; Din="Q.100";Seleccionar=true;}
          if(bot237.isSelected()==true){Bot="Ocupado"; Nom="HH8"; Din="Q.100";Seleccionar=true;}
          if(bot238.isSelected()==true){Bot="Ocupado"; Nom="HH9"; Din="Q.100";Seleccionar=true;}
          if(bot239.isSelected()==true){Bot="Ocupado"; Nom="HH10"; Din="Q.100";Seleccionar=true;}
          if(bot240.isSelected()==true){Bot="Ocupado"; Nom="II1"; Din="Q.100";Seleccionar=true;}
          if(bot241.isSelected()==true){Bot="Ocupado"; Nom="II2"; Din="Q.100";Seleccionar=true;}
          if(bot242.isSelected()==true){Bot="Ocupado"; Nom="II3"; Din="Q.100";Seleccionar=true;}
          if(bot243.isSelected()==true){Bot="Ocupado"; Nom="II4"; Din="Q.100";Seleccionar=true;}
          if(bot244.isSelected()==true){Bot="Ocupado"; Nom="II5"; Din="Q.100";Seleccionar=true;}
          if(bot245.isSelected()==true){Bot="Ocupado"; Nom="II6"; Din="Q.100";Seleccionar=true;}
          if(bot246.isSelected()==true){Bot="Ocupado"; Nom="II7"; Din="Q.100";Seleccionar=true;}
          if(bot247.isSelected()==true){Bot="Ocupado"; Nom="II8"; Din="Q.100";Seleccionar=true;}
          if(bot248.isSelected()==true){Bot="Ocupado"; Nom="II9"; Din="Q.100";Seleccionar=true;}
          if(bot249.isSelected()==true){Bot="Ocupado"; Nom="II10"; Din="Q.100";Seleccionar=true;}
          if(bot250.isSelected()==true){Bot="Ocupado"; Nom="JJ1"; Din="Q.100";Seleccionar=true;}
          if(bot251.isSelected()==true){Bot="Ocupado"; Nom="JJ2"; Din="Q.100";Seleccionar=true;}
          if(bot252.isSelected()==true){Bot="Ocupado"; Nom="JJ3"; Din="Q.100";Seleccionar=true;}
          if(bot253.isSelected()==true){Bot="Ocupado"; Nom="JJ4"; Din="Q.100";Seleccionar=true;}
          if(bot254.isSelected()==true){Bot="Ocupado"; Nom="JJ5"; Din="Q.100";Seleccionar=true;}
          if(bot255.isSelected()==true){Bot="Ocupado"; Nom="JJ6"; Din="Q.100";Seleccionar=true;}
          if(bot256.isSelected()==true){Bot="Ocupado"; Nom="JJ7"; Din="Q.100";Seleccionar=true;}
          if(bot257.isSelected()==true){Bot="Ocupado"; Nom="JJ8"; Din="Q.100";Seleccionar=true;}
          if(bot258.isSelected()==true){Bot="Ocupado"; Nom="JJ9"; Din="Q.100";Seleccionar=true;}
          if(bot259.isSelected()==true){Bot="Ocupado"; Nom="JJ10"; Din="Q.100";Seleccionar=true;}
          if(bot260.isSelected()==true){Bot="Ocupado"; Nom="KK1"; Din="Q.100";Seleccionar=true;}
          if(bot261.isSelected()==true){Bot="Ocupado"; Nom="KK2"; Din="Q.75";Seleccionar=true;}
          if(bot262.isSelected()==true){Bot="Ocupado"; Nom="KK3"; Din="Q.75";Seleccionar=true;}
          if(bot263.isSelected()==true){Bot="Ocupado"; Nom="KK4"; Din="Q.75";Seleccionar=true;}
          if(bot264.isSelected()==true){Bot="Ocupado"; Nom="KK5"; Din="Q.75";Seleccionar=true;}
          if(bot265.isSelected()==true){Bot="Ocupado"; Nom="KK6"; Din="Q.75";Seleccionar=true;}
          if(bot266.isSelected()==true){Bot="Ocupado"; Nom="KK7"; Din="Q.75";Seleccionar=true;}
          if(bot267.isSelected()==true){Bot="Ocupado"; Nom="KK8"; Din="Q.75";Seleccionar=true;}
          if(bot268.isSelected()==true){Bot="Ocupado"; Nom="KK9"; Din="Q.75";Seleccionar=true;}
          if(bot269.isSelected()==true){Bot="Ocupado"; Nom="KK10"; Din="Q.75";Seleccionar=true;}
          if(bot270.isSelected()==true){Bot="Ocupado"; Nom="LL1"; Din="Q.75";Seleccionar=true;}
          if(bot271.isSelected()==true){Bot="Ocupado"; Nom="LL2"; Din="Q.75";Seleccionar=true;}
          if(bot272.isSelected()==true){Bot="Ocupado"; Nom="LL3"; Din="Q.75";Seleccionar=true;}
          if(bot273.isSelected()==true){Bot="Ocupado"; Nom="LL4"; Din="Q.75";Seleccionar=true;}
          if(bot274.isSelected()==true){Bot="Ocupado"; Nom="LL5"; Din="Q.75";Seleccionar=true;}
          if(bot275.isSelected()==true){Bot="Ocupado"; Nom="LL6"; Din="Q.75";Seleccionar=true;}
          if(bot276.isSelected()==true){Bot="Ocupado"; Nom="LL7"; Din="Q.75";Seleccionar=true;}
          if(bot277.isSelected()==true){Bot="Ocupado"; Nom="LL8"; Din="Q.75";Seleccionar=true;}
          if(bot278.isSelected()==true){Bot="Ocupado"; Nom="LL9"; Din="Q.75";Seleccionar=true;}
          if(bot279.isSelected()==true){Bot="Ocupado"; Nom="LL10"; Din="Q.75";Seleccionar=true;}
          if(bot280.isSelected()==true){Bot="Ocupado"; Nom="MM1"; Din="Q.75";Seleccionar=true;}
          if(bot281.isSelected()==true){Bot="Ocupado"; Nom="MM2"; Din="Q.75";Seleccionar=true;}
          if(bot282.isSelected()==true){Bot="Ocupado"; Nom="MM3"; Din="Q.75";Seleccionar=true;}
          if(bot283.isSelected()==true){Bot="Ocupado"; Nom="MM4"; Din="Q.75";Seleccionar=true;}
          if(bot284.isSelected()==true){Bot="Ocupado"; Nom="MM5"; Din="Q.75";Seleccionar=true;}
          if(bot285.isSelected()==true){Bot="Ocupado"; Nom="MM6"; Din="Q.75";Seleccionar=true;}
          if(bot286.isSelected()==true){Bot="Ocupado"; Nom="MM7"; Din="Q.75";Seleccionar=true;}
          if(bot287.isSelected()==true){Bot="Ocupado"; Nom="MM8"; Din="Q.75";Seleccionar=true;}
          if(bot288.isSelected()==true){Bot="Ocupado"; Nom="MM9"; Din="Q.75";Seleccionar=true;}
          if(bot289.isSelected()==true){Bot="Ocupado"; Nom="MM10"; Din="Q.75";Seleccionar=true;}
          if(bot290.isSelected()==true){Bot="Ocupado"; Nom="NN1"; Din="Q.75";Seleccionar=true;}
          if(bot291.isSelected()==true){Bot="Ocupado"; Nom="NN2"; Din="Q.75";Seleccionar=true;}
          if(bot292.isSelected()==true){Bot="Ocupado"; Nom="NN3"; Din="Q.75";Seleccionar=true;}
          if(bot293.isSelected()==true){Bot="Ocupado"; Nom="NN4"; Din="Q.75";Seleccionar=true;}
          if(bot294.isSelected()==true){Bot="Ocupado"; Nom="NN5"; Din="Q.75";Seleccionar=true;}
          if(bot295.isSelected()==true){Bot="Ocupado"; Nom="NN6"; Din="Q.75";Seleccionar=true;}
          if(bot296.isSelected()==true){Bot="Ocupado"; Nom="NN7"; Din="Q.75";Seleccionar=true;}
          if(bot297.isSelected()==true){Bot="Ocupado"; Nom="NN8"; Din="Q.75";Seleccionar=true;}
          if(bot298.isSelected()==true){Bot="Ocupado"; Nom="NN9"; Din="Q.75";Seleccionar=true;}
          if(bot299.isSelected()==true){Bot="Ocupado"; Nom="NN10"; Din="Q.75";Seleccionar=true;}
          if(bot300.isSelected()==true){Bot="Ocupado"; Nom="AA11"; Din="Q.200";Seleccionar=true;}
          if(bot301.isSelected()==true){Bot="Ocupado"; Nom="AA12"; Din="Q.200";Seleccionar=true;}
          if(bot302.isSelected()==true){Bot="Ocupado"; Nom="AA13"; Din="Q.200";Seleccionar=true;}
          if(bot303.isSelected()==true){Bot="Ocupado"; Nom="AA14"; Din="Q.200";Seleccionar=true;}
          if(bot304.isSelected()==true){Bot="Ocupado"; Nom="AA15"; Din="Q.200";Seleccionar=true;}
          if(bot305.isSelected()==true){Bot="Ocupado"; Nom="AA16"; Din="Q.200";Seleccionar=true;}
          if(bot306.isSelected()==true){Bot="Ocupado"; Nom="AA17"; Din="Q.200";Seleccionar=true;}
          if(bot307.isSelected()==true){Bot="Ocupado"; Nom="AA18"; Din="Q.200";Seleccionar=true;}
          if(bot308.isSelected()==true){Bot="Ocupado"; Nom="AA19"; Din="Q.200";Seleccionar=true;}
          if(bot309.isSelected()==true){Bot="Ocupado"; Nom="AA20"; Din="Q.200";Seleccionar=true;}
          if(bot310.isSelected()==true){Bot="Ocupado"; Nom="BB11"; Din="Q.200";Seleccionar=true;}
          if(bot311.isSelected()==true){Bot="Ocupado"; Nom="BB12"; Din="Q.200";Seleccionar=true;}
          if(bot312.isSelected()==true){Bot="Ocupado"; Nom="BB13"; Din="Q.200";Seleccionar=true;}
          if(bot313.isSelected()==true){Bot="Ocupado"; Nom="BB14"; Din="Q.200";Seleccionar=true;}
          if(bot314.isSelected()==true){Bot="Ocupado"; Nom="BB15"; Din="Q.200";Seleccionar=true;}
          if(bot315.isSelected()==true){Bot="Ocupado"; Nom="BB16"; Din="Q.200";Seleccionar=true;}
          if(bot316.isSelected()==true){Bot="Ocupado"; Nom="BB17"; Din="Q.200";Seleccionar=true;}
          if(bot317.isSelected()==true){Bot="Ocupado"; Nom="BB18"; Din="Q.200";Seleccionar=true;}
          if(bot318.isSelected()==true){Bot="Ocupado"; Nom="BB19"; Din="Q.200";Seleccionar=true;}
          if(bot319.isSelected()==true){Bot="Ocupado"; Nom="BB20"; Din="Q.200";Seleccionar=true;}
          if(bot320.isSelected()==true){Bot="Ocupado"; Nom="CC11"; Din="Q.150";Seleccionar=true;}
          if(bot321.isSelected()==true){Bot="Ocupado"; Nom="CC12"; Din="Q.150";Seleccionar=true;}
          if(bot322.isSelected()==true){Bot="Ocupado"; Nom="CC13"; Din="Q.150";Seleccionar=true;}
          if(bot323.isSelected()==true){Bot="Ocupado"; Nom="CC14"; Din="Q.150";Seleccionar=true;}
          if(bot324.isSelected()==true){Bot="Ocupado"; Nom="CC15"; Din="Q.150";Seleccionar=true;}
          if(bot325.isSelected()==true){Bot="Ocupado"; Nom="CC16"; Din="Q.150";Seleccionar=true;}
          if(bot326.isSelected()==true){Bot="Ocupado"; Nom="CC17"; Din="Q.150";Seleccionar=true;}
          if(bot327.isSelected()==true){Bot="Ocupado"; Nom="CC18"; Din="Q.150";Seleccionar=true;}
          if(bot328.isSelected()==true){Bot="Ocupado"; Nom="CC19"; Din="Q.150";Seleccionar=true;}
          if(bot329.isSelected()==true){Bot="Ocupado"; Nom="CC20"; Din="Q.150";Seleccionar=true;}
          if(bot330.isSelected()==true){Bot="Ocupado"; Nom="DD11"; Din="Q.150";Seleccionar=true;}
          if(bot331.isSelected()==true){Bot="Ocupado"; Nom="DD12"; Din="Q.150";Seleccionar=true;}
          if(bot332.isSelected()==true){Bot="Ocupado"; Nom="DD13"; Din="Q.150";Seleccionar=true;}
          if(bot333.isSelected()==true){Bot="Ocupado"; Nom="DD14"; Din="Q.150";Seleccionar=true;}
          if(bot334.isSelected()==true){Bot="Ocupado"; Nom="DD15"; Din="Q.150";Seleccionar=true;}
          if(bot335.isSelected()==true){Bot="Ocupado"; Nom="DD16"; Din="Q.150";Seleccionar=true;}
          if(bot336.isSelected()==true){Bot="Ocupado"; Nom="DD17"; Din="Q.150";Seleccionar=true;}
          if(bot337.isSelected()==true){Bot="Ocupado"; Nom="DD18"; Din="Q.150";Seleccionar=true;}
          if(bot338.isSelected()==true){Bot="Ocupado"; Nom="DD19"; Din="Q.150";Seleccionar=true;}
          if(bot339.isSelected()==true){Bot="Ocupado"; Nom="DD20"; Din="Q.150";Seleccionar=true;}
          if(bot340.isSelected()==true){Bot="Ocupado"; Nom="EE11"; Din="Q.150";Seleccionar=true;}
          if(bot341.isSelected()==true){Bot="Ocupado"; Nom="EE12"; Din="Q.150";Seleccionar=true;}
          if(bot342.isSelected()==true){Bot="Ocupado"; Nom="EE13"; Din="Q.150";Seleccionar=true;}
          if(bot343.isSelected()==true){Bot="Ocupado"; Nom="EE14"; Din="Q.150";Seleccionar=true;}
          if(bot344.isSelected()==true){Bot="Ocupado"; Nom="EE15"; Din="Q.150";Seleccionar=true;}
          if(bot345.isSelected()==true){Bot="Ocupado"; Nom="EE16"; Din="Q.150";Seleccionar=true;}
          if(bot346.isSelected()==true){Bot="Ocupado"; Nom="EE17"; Din="Q.150";Seleccionar=true;}
          if(bot347.isSelected()==true){Bot="Ocupado"; Nom="EE18"; Din="Q.150";Seleccionar=true;}
          if(bot348.isSelected()==true){Bot="Ocupado"; Nom="EE19"; Din="Q.150";Seleccionar=true;}
          if(bot349.isSelected()==true){Bot="Ocupado"; Nom="EE20"; Din="Q.150";Seleccionar=true;}
          if(bot350.isSelected()==true){Bot="Ocupado"; Nom="FF11"; Din="Q.150";Seleccionar=true;}
          if(bot351.isSelected()==true){Bot="Ocupado"; Nom="FF12"; Din="Q.150";Seleccionar=true;}
          if(bot352.isSelected()==true){Bot="Ocupado"; Nom="FF13"; Din="Q.150";Seleccionar=true;}
          if(bot353.isSelected()==true){Bot="Ocupado"; Nom="FF14"; Din="Q.150";Seleccionar=true;}
          if(bot354.isSelected()==true){Bot="Ocupado"; Nom="FF15"; Din="Q.150";Seleccionar=true;}
          if(bot355.isSelected()==true){Bot="Ocupado"; Nom="FF16"; Din="Q.150";Seleccionar=true;}
          if(bot356.isSelected()==true){Bot="Ocupado"; Nom="FF17"; Din="Q.150";Seleccionar=true;}
          if(bot357.isSelected()==true){Bot="Ocupado"; Nom="FF18"; Din="Q.150";Seleccionar=true;}
          if(bot358.isSelected()==true){Bot="Ocupado"; Nom="FF19"; Din="Q.150";Seleccionar=true;}
          if(bot359.isSelected()==true){Bot="Ocupado"; Nom="FF20"; Din="Q.150";Seleccionar=true;}
          if(bot360.isSelected()==true){Bot="Ocupado"; Nom="GG11"; Din="Q.150";Seleccionar=true;}
          if(bot361.isSelected()==true){Bot="Ocupado"; Nom="GG12"; Din="Q.150";Seleccionar=true;}
          if(bot362.isSelected()==true){Bot="Ocupado"; Nom="GG13"; Din="Q.150";Seleccionar=true;}
          if(bot363.isSelected()==true){Bot="Ocupado"; Nom="GG14"; Din="Q.150";Seleccionar=true;}
          if(bot364.isSelected()==true){Bot="Ocupado"; Nom="GG15"; Din="Q.150";Seleccionar=true;}
          if(bot365.isSelected()==true){Bot="Ocupado"; Nom="GG16"; Din="Q.150";Seleccionar=true;}
          if(bot366.isSelected()==true){Bot="Ocupado"; Nom="GG17"; Din="Q.150";Seleccionar=true;}
          if(bot367.isSelected()==true){Bot="Ocupado"; Nom="GG18"; Din="Q.150";Seleccionar=true;}
          if(bot368.isSelected()==true){Bot="Ocupado"; Nom="GG19"; Din="Q.150";Seleccionar=true;}
          if(bot369.isSelected()==true){Bot="Ocupado"; Nom="GG20"; Din="Q.150";Seleccionar=true;}
          if(bot370.isSelected()==true){Bot="Ocupado"; Nom="HH11"; Din="Q.100";Seleccionar=true;}
          if(bot371.isSelected()==true){Bot="Ocupado"; Nom="HH12"; Din="Q.100";Seleccionar=true;}
          if(bot372.isSelected()==true){Bot="Ocupado"; Nom="HH13"; Din="Q.100";Seleccionar=true;}
          if(bot373.isSelected()==true){Bot="Ocupado"; Nom="HH14"; Din="Q.100";Seleccionar=true;}
          if(bot374.isSelected()==true){Bot="Ocupado"; Nom="HH15"; Din="Q.100";Seleccionar=true;}
          if(bot375.isSelected()==true){Bot="Ocupado"; Nom="HH16"; Din="Q.100";Seleccionar=true;}
          if(bot376.isSelected()==true){Bot="Ocupado"; Nom="HH17"; Din="Q.100";Seleccionar=true;}
          if(bot377.isSelected()==true){Bot="Ocupado"; Nom="HH18"; Din="Q.100";Seleccionar=true;}
          if(bot378.isSelected()==true){Bot="Ocupado"; Nom="HH19"; Din="Q.100";Seleccionar=true;}
          if(bot379.isSelected()==true){Bot="Ocupado"; Nom="HH20"; Din="Q.100";Seleccionar=true;}
          if(bot380.isSelected()==true){Bot="Ocupado"; Nom="II11"; Din="Q.100";Seleccionar=true;}
          if(bot381.isSelected()==true){Bot="Ocupado"; Nom="II12"; Din="Q.100";Seleccionar=true;}
          if(bot382.isSelected()==true){Bot="Ocupado"; Nom="II13"; Din="Q.100";Seleccionar=true;}
          if(bot383.isSelected()==true){Bot="Ocupado"; Nom="II14"; Din="Q.100";Seleccionar=true;}
          if(bot384.isSelected()==true){Bot="Ocupado"; Nom="II15"; Din="Q.100";Seleccionar=true;}
          if(bot385.isSelected()==true){Bot="Ocupado"; Nom="II16"; Din="Q.100";Seleccionar=true;}
          if(bot386.isSelected()==true){Bot="Ocupado"; Nom="II17"; Din="Q.100";Seleccionar=true;}
          if(bot387.isSelected()==true){Bot="Ocupado"; Nom="II18"; Din="Q.100";Seleccionar=true;}
          if(bot388.isSelected()==true){Bot="Ocupado"; Nom="II19"; Din="Q.100";Seleccionar=true;}
          if(bot389.isSelected()==true){Bot="Ocupado"; Nom="II20"; Din="Q.100";Seleccionar=true;}
          if(bot390.isSelected()==true){Bot="Ocupado"; Nom="JJ11"; Din="Q.100";Seleccionar=true;}
          if(bot391.isSelected()==true){Bot="Ocupado"; Nom="JJ12"; Din="Q.100";Seleccionar=true;}
          if(bot392.isSelected()==true){Bot="Ocupado"; Nom="JJ13"; Din="Q.100";Seleccionar=true;}
          if(bot393.isSelected()==true){Bot="Ocupado"; Nom="JJ14"; Din="Q.100";Seleccionar=true;}
          if(bot394.isSelected()==true){Bot="Ocupado"; Nom="JJ15"; Din="Q.100";Seleccionar=true;}
          if(bot395.isSelected()==true){Bot="Ocupado"; Nom="JJ16"; Din="Q.100";Seleccionar=true;}
          if(bot396.isSelected()==true){Bot="Ocupado"; Nom="JJ17"; Din="Q.100";Seleccionar=true;}
          if(bot397.isSelected()==true){Bot="Ocupado"; Nom="JJ18"; Din="Q.100";Seleccionar=true;}
          if(bot398.isSelected()==true){Bot="Ocupado"; Nom="JJ19"; Din="Q.100";Seleccionar=true;}
          if(bot399.isSelected()==true){Bot="Ocupado"; Nom="JJ20"; Din="Q.100";Seleccionar=true;}
          if(bot400.isSelected()==true){Bot="Ocupado"; Nom="KK12"; Din="Q.100";Seleccionar=true;}
          if(bot401.isSelected()==true){Bot="Ocupado"; Nom="KK12"; Din="Q.75";Seleccionar=true;}
          if(bot402.isSelected()==true){Bot="Ocupado"; Nom="KK13"; Din="Q.75";Seleccionar=true;}
          if(bot403.isSelected()==true){Bot="Ocupado"; Nom="KK14"; Din="Q.75";Seleccionar=true;}
          if(bot404.isSelected()==true){Bot="Ocupado"; Nom="KK15"; Din="Q.75";Seleccionar=true;}
          if(bot405.isSelected()==true){Bot="Ocupado"; Nom="KK16"; Din="Q.75";Seleccionar=true;}
          if(bot406.isSelected()==true){Bot="Ocupado"; Nom="KK17"; Din="Q.75";Seleccionar=true;}
          if(bot407.isSelected()==true){Bot="Ocupado"; Nom="KK18"; Din="Q.75";Seleccionar=true;}
          if(bot408.isSelected()==true){Bot="Ocupado"; Nom="KK19"; Din="Q.75";Seleccionar=true;}
          if(bot409.isSelected()==true){Bot="Ocupado"; Nom="KK20"; Din="Q.75";Seleccionar=true;}
          if(bot410.isSelected()==true){Bot="Ocupado"; Nom="LL11"; Din="Q.75";Seleccionar=true;}
          if(bot411.isSelected()==true){Bot="Ocupado"; Nom="LL12"; Din="Q.75";Seleccionar=true;}
          if(bot412.isSelected()==true){Bot="Ocupado"; Nom="LL13"; Din="Q.75";Seleccionar=true;}
          if(bot413.isSelected()==true){Bot="Ocupado"; Nom="LL14"; Din="Q.75";Seleccionar=true;}
          if(bot414.isSelected()==true){Bot="Ocupado"; Nom="LL15"; Din="Q.75";Seleccionar=true;}
          if(bot415.isSelected()==true){Bot="Ocupado"; Nom="LL16"; Din="Q.75";Seleccionar=true;}
          if(bot416.isSelected()==true){Bot="Ocupado"; Nom="LL17"; Din="Q.75";Seleccionar=true;}
          if(bot417.isSelected()==true){Bot="Ocupado"; Nom="LL18"; Din="Q.75";Seleccionar=true;}
          if(bot418.isSelected()==true){Bot="Ocupado"; Nom="LL19"; Din="Q.75";Seleccionar=true;}
          if(bot419.isSelected()==true){Bot="Ocupado"; Nom="LL20"; Din="Q.75";Seleccionar=true;}
          if(bot420.isSelected()==true){Bot="Ocupado"; Nom="MM11"; Din="Q.75";Seleccionar=true;}
          if(bot421.isSelected()==true){Bot="Ocupado"; Nom="MM12"; Din="Q.75";Seleccionar=true;}
          if(bot422.isSelected()==true){Bot="Ocupado"; Nom="MM13"; Din="Q.75";Seleccionar=true;}
          if(bot423.isSelected()==true){Bot="Ocupado"; Nom="MM14"; Din="Q.75";Seleccionar=true;}
          if(bot424.isSelected()==true){Bot="Ocupado"; Nom="MM15"; Din="Q.75";Seleccionar=true;}
          if(bot425.isSelected()==true){Bot="Ocupado"; Nom="MM16"; Din="Q.75";Seleccionar=true;}
          if(bot426.isSelected()==true){Bot="Ocupado"; Nom="MM17"; Din="Q.75";Seleccionar=true;}
          if(bot427.isSelected()==true){Bot="Ocupado"; Nom="MM18"; Din="Q.75";Seleccionar=true;}
          if(bot428.isSelected()==true){Bot="Ocupado"; Nom="MM19"; Din="Q.75";Seleccionar=true;}
          if(bot429.isSelected()==true){Bot="Ocupado"; Nom="MM20"; Din="Q.75";Seleccionar=true;}
          if(bot430.isSelected()==true){Bot="Ocupado"; Nom="NN11"; Din="Q.75";Seleccionar=true;}
          if(bot431.isSelected()==true){Bot="Ocupado"; Nom="NN12"; Din="Q.75";Seleccionar=true;}
          if(bot432.isSelected()==true){Bot="Ocupado"; Nom="NN13"; Din="Q.75";Seleccionar=true;}
          if(bot433.isSelected()==true){Bot="Ocupado"; Nom="NN14"; Din="Q.75";Seleccionar=true;}
          if(bot434.isSelected()==true){Bot="Ocupado"; Nom="NN15"; Din="Q.75";Seleccionar=true;}
          if(bot435.isSelected()==true){Bot="Ocupado"; Nom="NN16"; Din="Q.75";Seleccionar=true;}
          if(bot436.isSelected()==true){Bot="Ocupado"; Nom="NN17"; Din="Q.75";Seleccionar=true;}
          if(bot437.isSelected()==true){Bot="Ocupado"; Nom="NN18"; Din="Q.75";Seleccionar=true;}
          if(bot438.isSelected()==true){Bot="Ocupado"; Nom="NN19"; Din="Q.75";Seleccionar=true;}
          if(bot439.isSelected()==true){Bot="Ocupado"; Nom="NN20"; Din="Q.75";Seleccionar=true;}
          if(bot440.isSelected()==true){Bot="Ocupado"; Nom="AA11"; Din="Q.150";Seleccionar=true;}
          if(bot441.isSelected()==true){Bot="Ocupado"; Nom="AA2"; Din="Q.150";Seleccionar=true;}
          if(bot442.isSelected()==true){Bot="Ocupado"; Nom="AA13"; Din="Q.150";Seleccionar=true;}
          if(bot443.isSelected()==true){Bot="Ocupado"; Nom="AA14"; Din="Q.150";Seleccionar=true;}
          if(bot444.isSelected()==true){Bot="Ocupado"; Nom="AA15"; Din="Q.150";Seleccionar=true;}
          if(bot445.isSelected()==true){Bot="Ocupado"; Nom="AA16"; Din="Q.150";Seleccionar=true;}
          if(bot446.isSelected()==true){Bot="Ocupado"; Nom="BB11"; Din="Q.150";Seleccionar=true;}
          if(bot447.isSelected()==true){Bot="Ocupado"; Nom="BB12"; Din="Q.150";Seleccionar=true;}
          if(bot448.isSelected()==true){Bot="Ocupado"; Nom="BB13"; Din="Q.150";Seleccionar=true;}
          if(bot449.isSelected()==true){Bot="Ocupado"; Nom="BB14"; Din="Q.150";Seleccionar=true;}
          if(bot450.isSelected()==true){Bot="Ocupado"; Nom="BB15"; Din="Q.150";Seleccionar=true;}
          if(bot451.isSelected()==true){Bot="Ocupado"; Nom="BB16"; Din="Q.150";Seleccionar=true;}
          if(bot452.isSelected()==true){Bot="Ocupado"; Nom="BB17"; Din="Q.150";Seleccionar=true;}
          if(bot453.isSelected()==true){Bot="Ocupado"; Nom="CC11"; Din="Q.150";Seleccionar=true;}
          if(bot454.isSelected()==true){Bot="Ocupado"; Nom="CC12"; Din="Q.150";Seleccionar=true;}
          if(bot455.isSelected()==true){Bot="Ocupado"; Nom="CC13"; Din="Q.150";Seleccionar=true;}
          if(bot456.isSelected()==true){Bot="Ocupado"; Nom="CC14"; Din="Q.150";Seleccionar=true;}
          if(bot457.isSelected()==true){Bot="Ocupado"; Nom="CC15"; Din="Q.150";Seleccionar=true;}
          if(bot458.isSelected()==true){Bot="Ocupado"; Nom="CC16"; Din="Q.150";Seleccionar=true;}
          if(bot459.isSelected()==true){Bot="Ocupado"; Nom="CC17"; Din="Q.150";Seleccionar=true;}
          if(bot460.isSelected()==true){Bot="Ocupado"; Nom="CC18"; Din="Q.150";Seleccionar=true;}
          if(bot461.isSelected()==true){Bot="Ocupado"; Nom="DD11"; Din="Q.100";Seleccionar=true;}
          if(bot462.isSelected()==true){Bot="Ocupado"; Nom="DD12"; Din="Q.100";Seleccionar=true;}
          if(bot463.isSelected()==true){Bot="Ocupado"; Nom="DD13"; Din="Q.100";Seleccionar=true;}
          if(bot464.isSelected()==true){Bot="Ocupado"; Nom="DD14"; Din="Q.100";Seleccionar=true;}
          if(bot465.isSelected()==true){Bot="Ocupado"; Nom="DD15"; Din="Q.100";Seleccionar=true;}
          if(bot466.isSelected()==true){Bot="Ocupado"; Nom="DD16"; Din="Q.100";Seleccionar=true;}
          if(bot467.isSelected()==true){Bot="Ocupado"; Nom="DD17"; Din="Q.100";Seleccionar=true;}
          if(bot468.isSelected()==true){Bot="Ocupado"; Nom="DD18"; Din="Q.100";Seleccionar=true;}
          if(bot469.isSelected()==true){Bot="Ocupado"; Nom="DD19"; Din="Q.100";Seleccionar=true;}
          if(bot470.isSelected()==true){Bot="Ocupado"; Nom="EE11"; Din="Q.100";Seleccionar=true;}
          if(bot471.isSelected()==true){Bot="Ocupado"; Nom="EE12"; Din="Q.100";Seleccionar=true;}
          if(bot472.isSelected()==true){Bot="Ocupado"; Nom="EE13"; Din="Q.100";Seleccionar=true;}
          if(bot473.isSelected()==true){Bot="Ocupado"; Nom="EE14"; Din="Q.100";Seleccionar=true;}
          if(bot474.isSelected()==true){Bot="Ocupado"; Nom="EE15"; Din="Q.100";Seleccionar=true;}
          if(bot475.isSelected()==true){Bot="Ocupado"; Nom="EE16"; Din="Q.100";Seleccionar=true;}
          if(bot476.isSelected()==true){Bot="Ocupado"; Nom="EE17"; Din="Q.100";Seleccionar=true;}
          if(bot477.isSelected()==true){Bot="Ocupado"; Nom="EE18"; Din="Q.100";Seleccionar=true;}
          if(bot478.isSelected()==true){Bot="Ocupado"; Nom="EE19"; Din="Q.100";Seleccionar=true;}
          if(bot479.isSelected()==true){Bot="Ocupado"; Nom="EE110"; Din="Q.100";Seleccionar=true;}
          if(bot480.isSelected()==true){Bot="Ocupado"; Nom="FF11"; Din="Q.100";Seleccionar=true;}
          if(bot481.isSelected()==true){Bot="Ocupado"; Nom="FF12"; Din="Q.100";Seleccionar=true;}
          if(bot482.isSelected()==true){Bot="Ocupado"; Nom="FF13"; Din="Q.100";Seleccionar=true;}
          if(bot483.isSelected()==true){Bot="Ocupado"; Nom="FF14"; Din="Q.100";Seleccionar=true;}
          if(bot484.isSelected()==true){Bot="Ocupado"; Nom="FF15"; Din="Q.100";Seleccionar=true;}
          if(bot485.isSelected()==true){Bot="Ocupado"; Nom="FF16"; Din="Q.100";Seleccionar=true;}
          if(bot486.isSelected()==true){Bot="Ocupado"; Nom="FF17"; Din="Q.100";Seleccionar=true;}
          if(bot487.isSelected()==true){Bot="Ocupado"; Nom="FF18"; Din="Q.100";Seleccionar=true;}
          if(bot488.isSelected()==true){Bot="Ocupado"; Nom="FF19"; Din="Q.100";Seleccionar=true;}
          if(bot489.isSelected()==true){Bot="Ocupado"; Nom="FF20"; Din="Q.100";Seleccionar=true;}
          if(bot490.isSelected()==true){Bot="Ocupado"; Nom="FF21"; Din="Q.100";Seleccionar=true;}
          if(bot491.isSelected()==true){Bot="Ocupado"; Nom="GG11"; Din="Q.100";Seleccionar=true;}
          if(bot492.isSelected()==true){Bot="Ocupado"; Nom="GG12"; Din="Q.100";Seleccionar=true;}
          if(bot493.isSelected()==true){Bot="Ocupado"; Nom="GG13"; Din="Q.100";Seleccionar=true;}
          if(bot494.isSelected()==true){Bot="Ocupado"; Nom="GG14"; Din="Q.100";Seleccionar=true;}
          if(bot495.isSelected()==true){Bot="Ocupado"; Nom="GG15"; Din="Q.100";Seleccionar=true;}
          if(bot496.isSelected()==true){Bot="Ocupado"; Nom="GG16"; Din="Q.100";Seleccionar=true;}
          if(bot497.isSelected()==true){Bot="Ocupado"; Nom="GG17"; Din="Q.100";Seleccionar=true;}
          if(bot498.isSelected()==true){Bot="Ocupado"; Nom="GG18"; Din="Q.100";Seleccionar=true;}
          if(bot499.isSelected()==true){Bot="Ocupado"; Nom="GG19"; Din="Q.100";Seleccionar=true;}
          if(bot500.isSelected()==true){Bot="Ocupado"; Nom="GG20"; Din="Q.100";Seleccionar=true;}
          if(bot501.isSelected()==true){Bot="Ocupado"; Nom="GG21"; Din="Q.100";Seleccionar=true;}
          if(bot502.isSelected()==true){Bot="Ocupado"; Nom="HH11"; Din="Q.75";Seleccionar=true;}
          if(bot503.isSelected()==true){Bot="Ocupado"; Nom="HH12"; Din="Q.75";Seleccionar=true;}
          if(bot504.isSelected()==true){Bot="Ocupado"; Nom="HH13"; Din="Q.75";Seleccionar=true;}
          if(bot505.isSelected()==true){Bot="Ocupado"; Nom="HH14"; Din="Q.75";Seleccionar=true;}
          if(bot506.isSelected()==true){Bot="Ocupado"; Nom="HH15"; Din="Q.75";Seleccionar=true;}
          if(bot507.isSelected()==true){Bot="Ocupado"; Nom="HH16"; Din="Q.75";Seleccionar=true;}
          if(bot508.isSelected()==true){Bot="Ocupado"; Nom="HH17"; Din="Q.75";Seleccionar=true;}
          if(bot509.isSelected()==true){Bot="Ocupado"; Nom="HH18"; Din="Q.75";Seleccionar=true;}
          if(bot510.isSelected()==true){Bot="Ocupado"; Nom="HH19"; Din="Q.75";Seleccionar=true;}
          if(bot511.isSelected()==true){Bot="Ocupado"; Nom="HH20"; Din="Q.75";Seleccionar=true;}
          if(bot512.isSelected()==true){Bot="Ocupado"; Nom="HH21"; Din="Q.75";Seleccionar=true;}
          if(bot513.isSelected()==true){Bot="Ocupado"; Nom="II11"; Din="Q.75";Seleccionar=true;}
          if(bot514.isSelected()==true){Bot="Ocupado"; Nom="II12"; Din="Q.75";Seleccionar=true;}
          if(bot515.isSelected()==true){Bot="Ocupado"; Nom="II13"; Din="Q.75";Seleccionar=true;}
          if(bot516.isSelected()==true){Bot="Ocupado"; Nom="II14"; Din="Q.75";Seleccionar=true;}
          if(bot517.isSelected()==true){Bot="Ocupado"; Nom="II15"; Din="Q.75";Seleccionar=true;}
          if(bot518.isSelected()==true){Bot="Ocupado"; Nom="II16"; Din="Q.75";Seleccionar=true;}
          if(bot519.isSelected()==true){Bot="Ocupado"; Nom="II17"; Din="Q.75";Seleccionar=true;}
          if(bot520.isSelected()==true){Bot="Ocupado"; Nom="II18"; Din="Q.75";Seleccionar=true;}
          if(bot521.isSelected()==true){Bot="Ocupado"; Nom="II19"; Din="Q.75";Seleccionar=true;}
          if(bot522.isSelected()==true){Bot="Ocupado"; Nom="II20"; Din="Q.75";Seleccionar=true;}
          if(bot523.isSelected()==true){Bot="Ocupado"; Nom="II21"; Din="Q.75";Seleccionar=true;}
          if(bot524.isSelected()==true){Bot="Ocupado"; Nom="JJ11"; Din="Q.75";Seleccionar=true;}
          if(bot525.isSelected()==true){Bot="Ocupado"; Nom="JJ12"; Din="Q.75";Seleccionar=true;}
          if(bot526.isSelected()==true){Bot="Ocupado"; Nom="JJ13"; Din="Q.75";Seleccionar=true;}
          if(bot527.isSelected()==true){Bot="Ocupado"; Nom="JJ14"; Din="Q.75";Seleccionar=true;}
          if(bot528.isSelected()==true){Bot="Ocupado"; Nom="JJ15"; Din="Q.75";Seleccionar=true;}
          if(bot529.isSelected()==true){Bot="Ocupado"; Nom="JJ16"; Din="Q.75";Seleccionar=true;}
          if(bot530.isSelected()==true){Bot="Ocupado"; Nom="JJ17"; Din="Q.75";Seleccionar=true;}
          if(bot531.isSelected()==true){Bot="Ocupado"; Nom="JJ18"; Din="Q.75";Seleccionar=true;}
          if(bot532.isSelected()==true){Bot="Ocupado"; Nom="JJ19"; Din="Q.75";Seleccionar=true;}
          if(bot533.isSelected()==true){Bot="Ocupado"; Nom="JJ20"; Din="Q.75";Seleccionar=true;}
          if(bot534.isSelected()==true){Bot="Ocupado"; Nom="JJ21"; Din="Q.75";Seleccionar=true;}
          if(bot535.isSelected()==true){Bot="Ocupado"; Nom="KK11"; Din="Q.75";Seleccionar=true;}
          if(bot536.isSelected()==true){Bot="Ocupado"; Nom="KK12"; Din="Q.75";Seleccionar=true;}
          if(bot537.isSelected()==true){Bot="Ocupado"; Nom="KK13"; Din="Q.75";Seleccionar=true;}
          if(bot538.isSelected()==true){Bot="Ocupado"; Nom="KK14"; Din="Q.75";Seleccionar=true;}
          if(bot539.isSelected()==true){Bot="Ocupado"; Nom="KK15"; Din="Q.75";Seleccionar=true;}
          if(bot540.isSelected()==true){Bot="Ocupado"; Nom="KK16"; Din="Q.75";Seleccionar=true;}
          if(bot541.isSelected()==true){Bot="Ocupado"; Nom="KK17"; Din="Q.75";Seleccionar=true;}
          if(bot542.isSelected()==true){Bot="Ocupado"; Nom="KK18"; Din="Q.75";Seleccionar=true;}
          if(bot543.isSelected()==true){Bot="Ocupado"; Nom="KK19"; Din="Q.75";Seleccionar=true;}
          if(bot544.isSelected()==true){Bot="Ocupado"; Nom="KK20"; Din="Q.75";Seleccionar=true;}
          if(bot545.isSelected()==true){Bot="Ocupado"; Nom="KK21"; Din="Q.75";Seleccionar=true;}
          if(bot546.isSelected()==true){Bot="Ocupado"; Nom="LL11"; Din="Q.75";Seleccionar=true;}
          if(bot547.isSelected()==true){Bot="Ocupado"; Nom="LL12"; Din="Q.75";Seleccionar=true;}
          if(bot548.isSelected()==true){Bot="Ocupado"; Nom="LL13"; Din="Q.75";Seleccionar=true;}
          if(bot549.isSelected()==true){Bot="Ocupado"; Nom="LL14"; Din="Q.75";Seleccionar=true;}
          if(bot550.isSelected()==true){Bot="Ocupado"; Nom="LL15"; Din="Q.75";Seleccionar=true;}
          if(bot551.isSelected()==true){Bot="Ocupado"; Nom="LL16"; Din="Q.75";Seleccionar=true;}
          if(bot552.isSelected()==true){Bot="Ocupado"; Nom="LL17"; Din="Q.75";Seleccionar=true;}
          if(bot553.isSelected()==true){Bot="Ocupado"; Nom="LL18"; Din="Q.75";Seleccionar=true;}
          if(bot554.isSelected()==true){Bot="Ocupado"; Nom="LL19"; Din="Q.75";Seleccionar=true;}
          if(bot555.isSelected()==true){Bot="Ocupado"; Nom="LL20"; Din="Q.75";Seleccionar=true;}
          if(bot556.isSelected()==true){Bot="Ocupado"; Nom="LL21"; Din="Q.75";Seleccionar=true;}
          if(bot557.isSelected()==true){Bot="Ocupado"; Nom="MM11"; Din="Q.75";Seleccionar=true;}
          if(bot558.isSelected()==true){Bot="Ocupado"; Nom="MM12"; Din="Q.75";Seleccionar=true;}
          if(bot559.isSelected()==true){Bot="Ocupado"; Nom="MM13"; Din="Q.75";Seleccionar=true;}
          if(bot560.isSelected()==true){Bot="Ocupado"; Nom="MM14"; Din="Q.75";Seleccionar=true;}
          if(bot561.isSelected()==true){Bot="Ocupado"; Nom="MM15"; Din="Q.75";Seleccionar=true;}
          if(bot562.isSelected()==true){Bot="Ocupado"; Nom="MM16"; Din="Q.75";Seleccionar=true;}
          if(bot563.isSelected()==true){Bot="Ocupado"; Nom="MM17"; Din="Q.75";Seleccionar=true;}
          if(bot564.isSelected()==true){Bot="Ocupado"; Nom="MM18"; Din="Q.75";Seleccionar=true;}
          if(bot565.isSelected()==true){Bot="Ocupado"; Nom="MM19"; Din="Q.75";Seleccionar=true;}
          if(bot566.isSelected()==true){Bot="Ocupado"; Nom="MM20"; Din="Q.75";Seleccionar=true;}
          if(bot567.isSelected()==true){Bot="Ocupado"; Nom="M21"; Din="Q.75";Seleccionar=true;}
          if(bot568.isSelected()==true){Bot="Ocupado"; Nom="NN11"; Din="Q.75";Seleccionar=true;}
          if(bot569.isSelected()==true){Bot="Ocupado"; Nom="NN12"; Din="Q.75";Seleccionar=true;}
          if(bot570.isSelected()==true){Bot="Ocupado"; Nom="NN13"; Din="Q.75";Seleccionar=true;}
          if(bot571.isSelected()==true){Bot="Ocupado"; Nom="NN14"; Din="Q.75";Seleccionar=true;}
          if(bot572.isSelected()==true){Bot="Ocupado"; Nom="NN15"; Din="Q.75";Seleccionar=true;}
          if(bot573.isSelected()==true){Bot="Ocupado"; Nom="NN16"; Din="Q.75";Seleccionar=true;}
          if(bot574.isSelected()==true){Bot="Ocupado"; Nom="NN17"; Din="Q.75";Seleccionar=true;}
          if(bot575.isSelected()==true){Bot="Ocupado"; Nom="NN18"; Din="Q.75";Seleccionar=true;}
          if(bot576.isSelected()==true){Bot="Ocupado"; Nom="NN19"; Din="Q.75";Seleccionar=true;}
          if(bot577.isSelected()==true){Bot="Ocupado"; Nom="NN20"; Din="Q.75";Seleccionar=true;}
          if(bot578.isSelected()==true){Bot="Ocupado"; Nom="NN21"; Din="Q.75";Seleccionar=true;}
          if(bot579.isSelected()==true){Bot="Ocupado"; Nom="0O11"; Din="Q.75";Seleccionar=true;}
          if(bot580.isSelected()==true){Bot="Ocupado"; Nom="OO12"; Din="Q.75";Seleccionar=true;}
          if(bot581.isSelected()==true){Bot="Ocupado"; Nom="OO13"; Din="Q.75";Seleccionar=true;}
          if(bot582.isSelected()==true){Bot="Ocupado"; Nom="OO14"; Din="Q.75";Seleccionar=true;}
          if(bot583.isSelected()==true){Bot="Ocupado"; Nom="OO15"; Din="Q.75";Seleccionar=true;}
          if(bot584.isSelected()==true){Bot="Ocupado"; Nom="OO16"; Din="Q.75";Seleccionar=true;}
          if(bot585.isSelected()==true){Bot="Ocupado"; Nom="OO17"; Din="Q.75";Seleccionar=true;}
          if(bot586.isSelected()==true){Bot="Ocupado"; Nom="OO18"; Din="Q.75";Seleccionar=true;}
          if(bot587.isSelected()==true){Bot="Ocupado"; Nom="OO19"; Din="Q.75";Seleccionar=true;}
          if(bot588.isSelected()==true){Bot="Ocupado"; Nom="0O20"; Din="Q.75";Seleccionar=true;}
          if(bot589.isSelected()==true){Bot="Ocupado"; Nom="OO21"; Din="Q.75";Seleccionar=true;}
          if(bot590.isSelected()==true){Bot="Ocupado"; Nom="PP11"; Din="Q.75";Seleccionar=true;}
          if(bot591.isSelected()==true){Bot="Ocupado"; Nom="PP12"; Din="Q.75";Seleccionar=true;}
          if(bot592.isSelected()==true){Bot="Ocupado"; Nom="PP13"; Din="Q.75";Seleccionar=true;}
          if(bot593.isSelected()==true){Bot="Ocupado"; Nom="PP14"; Din="Q.75";Seleccionar=true;}
          if(bot594.isSelected()==true){Bot="Ocupado"; Nom="PP15"; Din="Q.75";Seleccionar=true;}
          if(bot595.isSelected()==true){Bot="Ocupado"; Nom="PP16"; Din="Q.75";Seleccionar=true;}
          if(bot596.isSelected()==true){Bot="Ocupado"; Nom="PP17"; Din="Q.75";Seleccionar=true;}
          if(bot597.isSelected()==true){Bot="Ocupado"; Nom="PP18"; Din="Q.75";Seleccionar=true;}
        if(Seleccionar){
            Ingresar.asignar("null", Nom, Bot, Din,"null", "null", "null", "null", 0 ,"null");
            System.out.println(Bot);
            System.out.println(Nom);
            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText(null);
            a.setTitle("CORRECTO");
            a.setContentText("Acientos Confirmados");
            a.showAndWait();
            try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(Boletos.class.getResource("/Vistas/Registros.fxml"));
			Parent root = cargar.load();
                        Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);  
			stage.showAndWait();
                        stage.close();
                        Stage stagee= (Stage) this.r.getScene().getWindow();
                        stagee.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
        }
        }
}

