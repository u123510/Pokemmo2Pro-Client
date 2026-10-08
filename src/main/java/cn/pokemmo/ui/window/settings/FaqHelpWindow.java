package cn.pokemmo.ui.window.settings;

import f.*;

/**
 * 帮助中心与常见问题FAQ窗口
 *
 * 原混淆类: f.s90_0
 */
public class FaqHelpWindow extends yz_1 implements tr_1  {
    public final s90_0 asBridge() {
        return (s90_0) (Object) this;
    }

   public final BU com5;
   public final fy_2 UB0;
   public final lo0_0 O;
   public final ge_0 native$;
   public int XF;

   public FaqHelpWindow(BU var1) {
      super();
      this.XF = 0;
      this.com5 = var1;
      R9 var4 = new R9(var1);
      this.Pb0(var4);
      this.uf("faq-frame");
      this.Hy(sm0_0.c0(2400));
      this.ff0(1);
      qk0_2 var6 = new qk0_2();
      ge_0 var8 = new ge_0(var6);
      this.native$ = var8;
      StringBuilder var9 = new StringBuilder();
      var8.hp(new T90());
      if ("fr".equalsIgnoreCase(dw_2.con)) {
         Ij(var9, "orange", "title", "EST-CE QUE JE DOIS OBÉIR À DES RÈGLES EN JOUANT À POKEMMO?");
         z70(var9, new StringBuilder("Oui. En gros:<br/>- N'écris rien d'inapproprié.<br/>- Ne sois pas méchant envers les autres.<br/>- N'essaie pas de tricher.<br/>- Ne spamme pas, ne fais pas de pub.<br/>- N'essaie pas d'échanger des choses dans le jeu pour des choses en dehors du jeu.<br/>Tu peux trouver les règles complètes ici: ").append(this.Ns("https://pokemmo.com/code_of_conduct", "https://pokemmo.com/code_of_conduct")).append("<br/>Si tu repères quelqu'un qui brise ces règles, tu peux le signaler en utilisant la fenêtre Demande d'Aide.<br/>").toString());
         Ij(var9, "orange", "title", " DANS QUELLE ÉTAPE DE DÉVELOPPEMENT SE TROUVE POKEMMO?");
         z70(var9, new StringBuilder("PokeMMO est actuellement en Alpha Ouverte. Ceci veut dire que beaucoup de fonctionnalités ne sont pas encore finies et sont activement en développement par notre équipe. Nous demandons que tout retour d'informations concernant le gameplay soit posté dans la ").append(this.Ns("Suggestions Box", "https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/")).append(" et que les bugs soient signalés dans le ").append(this.Ns("Bug Reports", "https://forums.pokemmo.com/index.php?/forum/11-bug-report/")).append(" subforum.<br/>").toString());
         Ij(var9, "orange", "title", "MES DONNÉES DE JEU SERONT-ELLES EFFACÉES QUAND POKEMMO ATTEINT LA BETA?");
         z70(var9, "Non.<br/>");
         Ij(var9, "orange", "title", "QUAND EST LA PROCHAINE MISE À JOUR?");
         z70(var9, "Nous ne fournissons pas d'estimations du temps entre les mises à jour, mais dans des cycles de patch longs nous aurons souvent des builds d'aperçu disponibles de façon mensuelle.<br/>Jetez un œil aux Annonces pour les informations les plus récentes concernant le développement du jeu.<br/>");
         Ij(var9, "orange", "title", "QUE SIGNIFIE CM/GM?");
         z70(var9, "Les Modos (Dits \"CMs\") et Maîtres de Jeu (dits \"GMs\") sont des membres de la communauté bénévoles. Ils mettent en application les règles dans le jeu et créent des événements officiels pour les joueurs.<br/>");
         Ij(var9, "orange", "title", "MON PERSONNAGE EST COINCÉ. QU'EST-CE QUE JE FAIS?");
         z70(var9, "Si ton personnage est coincé dans une position normalement impossible, tape /unstuck et attends deux minutes.<br/>");
         Ij(var9, "orange", "title", "QUE SIGNIFIE 'Script ******* missing'?");
         z70(var9, "Cela veut dire que le script n'a pas encore été rédigé. Ce n'est pas un problème avec ton client et n'a pas besoin d'être signalé.<br/>");
         Ij(var9, "orange", "title", "COMMENT TROUVER UN CHROMATIQUE?");
         z70(var9, new StringBuilder("Les").append(sm0_0.c0(0)).append(" chromatiques peuvent, très rarement, être trouvés comme rencontres sauvages. Le Statut de Donateur améliore tes chances un petit peu.<br/>").toString());
      } else if ("es".equalsIgnoreCase(dw_2.con)) {
         Ij(var9, "orange", "title", "DEBO SEGUIR LAS REGLAS CUANGO ESTOY JUGANDO POKEMMO?");
         z70(var9, new StringBuilder("Sí. En general:<br/>- No digas cosas inapropriados.<br/>- No seas grosero/a a los otros jugadores.<br/>- No intentes de hacer trampa.<br/>- No hagas spam ni publiques.<br/>- No intentes de intercambiar una cosa en el juego por otra cosa afuera del juego.<br/>Puedes ver la lista entera en ").append(this.Ns("https://pokemmo.com/code_of_conduct", "https://pokemmo.com/code_of_conduct")).append("<br/>Si tú ves alguien que esta rompiendo estas reglas, por favor repórtalo usando una Solicitud de Ayuda.<br/>").toString());
         Ij(var9, "orange", "title", "EN CUAL ESTADO DE DESARROLLO ESTA POKEMMO?");
         z70(var9, new StringBuilder("PokeMMO esta en Open Alpha. Esto significa que muchas características aun no estan completas y que nosotros estamos trabajando para implementarlas. Pedimos que den feedback del juego en el Foro de PokeMMO en ").append(this.Ns("Suggestions Box", "https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/")).append(" y reporta cualquier bug en ").append(this.Ns("Bug Reports", "https://forums.pokemmo.com/index.php?/forum/11-bug-report/")).append(" subforum.<br/>").toString());
         Ij(var9, "orange", "title", "MI PROGRESO SERA BORRADO CUANDO POKEMMO SE PONGA EN BETA?");
         z70(var9, "No.<br/>");
         Ij(var9, "orange", "title", "CUANDO SERÁ LA PRÓXIMA ACTUALIZACIÓN?");
         z70(var9, "Nosotros no damos el tiempo aproximado para la próxima actualización, pero a veces tendremos una vista anticipada cada mes.<br/>Revisa los Anuncios para la información más reciente del desarrollo del juego.<br/>");
         Ij(var9, "orange", "title", "QUÉ SIGNIFICA CM/GM?");
         z70(var9, "Moderadores de Comunidad (Conocidos como \"CMs\") y Gamemasters (Conocidos como \"GMs\") son miembros voluntarios de la comunidad. Ellos imponen las reglas en el juego y crean eventos oficiales para los jugadores.<br/>");
         Ij(var9, "orange", "title", "MI PERSONAJE NO SE PUEDE MOVER/ESTA ATASCADO. QUÉ HAGO?");
         z70(var9, "Si tu personaje esta atascado en una posición imposible, escribe /unstuck y espera dos minutos.<br/>");
         Ij(var9, "orange", "title", "QUÉ SIGNIFICA 'Script ******* missing.'?");
         z70(var9, "Significa que ese script aún no esta escrito. Esto no es un problema con tu cliente y no debe ser reportado.<br/>");
         Ij(var9, "orange", "title", "COMO PUEDO ENCONTRAR UN SHINY(VARIOCOLOR)?");
         z70(var9, new StringBuilder("Los ").append(sm0_0.c0(0)).append(" shiny(variocolores) pueden, muy raramente, ser encontrados en la naturaleza. El Estado de Donativo subirá las chances de encontrar uno por un poco.<br/>").toString());
      } else if ("it".equalsIgnoreCase(dw_2.con)) {
         Ij(var9, "orange", "title", "C'È BISOGNO DI SEGUIRE LE REGOLE QUANDO GIOCO A POKEMMO?");
         z70(var9, "Sì. La questione è:<br/>-  Non postare cose inappropriate.<br/> - Non essere squallido con gli altri.<br/> - Non provare ad imbrogliare.<br/> - Non spammare o pubblicizzare.<br/> - Non provare a scambiare cose nel gioco con cose al di fuori del gioco.<br/>Puoi trovare tutte le regole su questa lista <a style=\"display: inline; float: left; font: link\" href=\"https://pokemmo.com/code_of_conduct\">https://pokemmo.com/code_of_conduct</a><br/>se trovi qualcuno che non rispetta le regole, per favore contattaci usando la finestra per le richieste di supporto.<br/>");
         Ij(var9, "orange", "title", "A QUALE STATO DI SVILUPPO È POKEMMO?");
         z70(var9, "PokeMMO è momentaneamente in Open Alpha. Questo significa che molte caratteristiche non sono complete e sono attivamente in lavorazione dal team di sviluppo. Vi chiediamo di scrivere dei feedback del gioco sul PokeMMO Forum sotto il <a style=\"display: inline; float: left; font: link\" href=\"https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/\">Contenitore suggerimenti</a> e riporto dei bugs attraverso il <a style=\"display: inline; float: left; font: link\" href=\"https://forums.pokemmo.com/index.php?/forum/11-bug-report/\">Riporto dei bug \"sotto\" forum</a>.<br/>");
         Ij(var9, "orange", "title", "I MIEI PROGRESSI SARANNO RIMOSSI QUANDO ENTRERÀ LA BETA DI POKEMMO?");
         z70(var9, "No.<br/>");
         Ij(var9, "orange", "title", "QUANDO SARÀ IL PROSSIMO AGGIORNAMENTO?");
         z70(var9, "Non sappiamo stimare un tempo preciso tra gli aggiornamenti, ma in una serie pesante di patch avremo spesso una preview avviabile mensilmente.<br/>Controlla gli Annunci sulle ultime info dello sviluppo del gioco.<br/>");
         Ij(var9, "orange", "title", "COSA SIGNIFICA CM/GM?");
         z70(var9, "Manager della Community (Conosciuto come \"CMs\") e Game Master (Conosciuto come \"GMs\") sono volontari membri della community. Loro fanno rispettare le regole nel gioco e creare eventi ufficiale per i giocatori.<br/>");
         Ij(var9, "orange", "title", "IL MIO PERSONAGGIO È BLOCCATO, COSA FACCIO?");
         z70(var9, "Se il tuo personaggio è bloccato in una posizione normalmente impossibile, scrivi /unstuck e aspetta due minuti.<br/>");
         Ij(var9, "orange", "title", "COSA SIGNIFICA 'Script ******* perso.'?");
         z70(var9, "Significa che lo script non è stato ancora scritto. Questo non è un problema col tuo client e non dovrebbe essere un problema.<br/>");
         Ij(var9, "orange", "title", "COME TROVO UNO SHINY?");
         z70(var9, new StringBuilder("Shiny ").append(sm0_0.c0(0)).append(" può, molto raramente, essere trovato negli scontri selvaggi. Lo Status Donatore aumenterà le tue chances di una piccola quantità.<br/>").toString());
      } else if ("de".equalsIgnoreCase(dw_2.con)) {
         Ij(var9, "orange", "title", "MUSS ICH REGELN BEFOLGEN WENN ICH POKEMMO SPIELE?");
         z70(var9, "Yes. The gist is:<br/>- Don't post inappropriate things.<br/>- Don't be mean to others.<br/>- Don't try to cheat.<br/>- Don't spam or advertise.<br/>- Don't try to trade things in the game for things outside the game.<br/>You can find the full rules listing at <a style=\"display: inline; float: left; font: link\" href=\"https://pokemmo.com/code_of_conduct\">https://pokemmo.com/code_of_conduct</a><br/>If you find someone breaking these rules, please report them using the Support Request window.<br/>");
         Ij(var9, "orange", "title", "IN WELCHEM ENTWICKLUNGSSTADIUM BEFINDET SICH POKEMMO?");
         z70(var9, "PokeMMO ist momentan in einer offenen Alpha. Das bedeutet, dass einige Funktionen unvollständig sind und aktiv vom Team entwickelt werden. Wir bitten dich Gameplayfeedback in den PokeMMO-Foren in der <a style=\"display: inline; float: left; font: link\" href=\"https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/\">Suggestions Box</a>  zu hinterlassen und Fehlerberichte im <a style=\"display: inline; float: left; font: link\" href=\"https://forums.pokemmo.com/index.php?/forum/11-bug-report/\">Bug Reports Unterforum</a> zu melden.<br/>");
         Ij(var9, "orange", "title", "WIRD MEIN FORTSCHRITT ZURÜCKGESETZT WENN DIE BETA BEGINNT?");
         z70(var9, "Nein.<br/>");
         Ij(var9, "orange", "title", "WANN KOMMT DAS NÄCHSTE UPDATE?");
         z70(var9, "We do not provide estimates on the time between updates, but in lengthy patch cycles we will often have preview builds available monthly.<br/>Check the Announcements for the latest info on the game's development.<br/>");
         Ij(var9, "orange", "title", "WAS BEDEUTET CM/GM?");
         z70(var9, "Community Managers (Known as \"CMs\") and Game Masters (Known as \"GMs\") are volunteer community members. They enforce rules in-game and create official events for players.<br/>");
         Ij(var9, "orange", "title", "MEIN CHARAKTER STECKT FEST. WAS SOLL ICH TUN?");
         z70(var9, "Wenn dein Charakter in einer normalerweise unerreichbaren Position feststeckt, gib /unstuck ein und warte 2 Minuten.<br/>");
         Ij(var9, "orange", "title", "WAS BEDEUTET 'Script ******* missing.' ?");
         z70(var9, "Das bedeutet, dass das Script noch nicht geschrieben wurde. Dabei handelt es sich um keinen Fehler mit deinem Client und musst nicht berichtet werden.<br/>");
         Ij(var9, "orange", "title", "WIE FINDE ICH EIN SHINY?");
         StringBuilder var10 = new StringBuilder("Shiny ");
         z70(var9, ig_0.u9(0, var10, " können sehr selten als wilde  ").append(sm0_0.c0(0)).append(" auftreten. Der Spenderstatus wird die Chancen ein wenig erhöhen.<br/>").toString());
      } else if ("zh".equalsIgnoreCase(dw_2.con)) {
         Ij(var9, "orange", "title", "玩POKEMMO需要遵守规则吗?");
         z70(var9, new StringBuilder("是的. 大致如下:- 不发表不当言论.- 不待人刻薄.- 不作弊.- 不发垃圾邮件或打广告.- 不在游戏内交易游戏之外的东西.全部规则可在 ").append(this.Ns("https://pokemmo.com/code_of_conduct", "https://pokemmo.com/code_of_conduct")).append(" 查阅.如果您发现有人违规, 请使用\"申请帮助\"窗口举报.").toString());
         Ij(var9, "orange", "title", "POKEMMO开发进展如何了?");
         z70(var9, new StringBuilder("PokeMMO现处于开放式内测阶段. 因此有的功能还没有完成, 并只对开发团队开放. 欢迎您在PokeMMO论坛 ").append(this.Ns("Suggestions Box", "https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/")).append(" 里向我们提供游戏反馈, 或者在 ").append(this.Ns("Bug Reports", "https://forums.pokemmo.com/index.php?/forum/11-bug-report/")).append(" 向我们报告BUG.").toString());
         Ij(var9, "orange", "title", "POKEMMO开启公测时会删档吗?");
         z70(var9, "不会.");
         Ij(var9, "orange", "title", "下一步的更新计划是什么?");
         z70(var9, "我们不预告更新时间, 但如果长时间补丁维护的话我们会按月发布预览版.请查看公告以了解游戏开发的最新进展.");
         Ij(var9, "orange", "title", "CM/GM是什么意思?");
         z70(var9, "社区管理(即\"CM\")和游戏管理员(即\"GM\")是志愿社区成员. 他们执行游戏规则并为玩家组织官方活动.");
         Ij(var9, "orange", "title", "我的角色卡住了. 怎么办?");
         z70(var9, "如果您的角色卡到错位了, 输入 /unstuck 并等待两分钟.");
         Ij(var9, "orange", "title", "'Script ******* missing.' 是什么意思?");
         z70(var9, "意思是脚本还没有被写入. 这不是您客户端的问题也不需要报告.");
         Ij(var9, "orange", "title", "如何抓到闪光?");
         z70(var9, new StringBuilder("有很小几率在野外遇到闪光").append(sm0_0.c0(0)).append(". 捐赠者状态可以提升几率.").toString());
      } else {
         Ij(var9, "orange", "title", "DO I NEED TO FOLLOW RULES WHEN PLAYING POKEMMO?");
         z70(var9, new StringBuilder("Yes. The gist is:<br/>- Don't post inappropriate things.<br/>- Don't be mean to others.<br/>- Don't try to cheat.<br/>- Don't spam or advertise.<br/>- Don't try to trade things in the game for things outside the game.<br/>You can find the full rules listing at ").append(this.Ns("https://pokemmo.com/code_of_conduct", "https://pokemmo.com/code_of_conduct")).append("<br/>If you find someone breaking these rules, please report them using the Support Request window.<br/>").toString());
         Ij(var9, "orange", "title", "WHAT STATE OF DEVELOPMENT IS POKEMMO IN?");
         z70(var9, new StringBuilder("PokeMMO is currently in an Open Alpha. This means that many features are not complete and are actively being worked on by the development team. We ask that you provide gameplay feedback on the PokeMMO Forums under the ").append(this.Ns("Suggestions Box", "https://forums.pokemmo.com/index.php?/forum/18-suggestion-box/")).append(" and reports bugs through the ").append(this.Ns("Bug Reports", "https://forums.pokemmo.com/index.php?/forum/11-bug-report/")).append(" subforum.<br/>").toString());
         Ij(var9, "orange", "title", "WILL MY PROGRESS BE REMOVED WHEN POKEMMO ENTERS BETA?");
         z70(var9, "No.<br/>");
         Ij(var9, "orange", "title", "WHEN IS THE NEXT UPDATE?");
         z70(var9, "We do not provide estimates on the time between updates, but in lengthy patch cycles we will often have preview builds available monthly.<br/>Check the Announcements for the latest info on the game's development.<br/>");
         Ij(var9, "orange", "title", "WHAT DOES CM/GM MEAN?");
         z70(var9, "Community Managers (Known as \"CMs\") and Game Masters (Known as \"GMs\") are volunteer community members. They enforce rules in-game and create official events for players.<br/>");
         Ij(var9, "orange", "title", "MY CHARACTER IS STUCK. WHAT DO I DO?");
         z70(var9, "If your character is stuck in a normally impossible position, type /unstuck and wait two minutes.<br/>");
         Ij(var9, "orange", "title", "WHAT DOES 'Script ******* missing.' mean?");
         z70(var9, "It means that the script has not been written yet. This is not an issue with your client and should not be reported.<br/>");
         Ij(var9, "orange", "title", "HOW DO I FIND A SHINY?");
         z70(var9, new StringBuilder("Shiny ").append(sm0_0.c0(0)).append(" can, very rarely, be found as wild encounters. Donator Status will improve your chances by a small amount.<br/>").toString());
      }
      var6.Eo(var9.toString());
      lo0_0 var12 = new lo0_0();
      this.O = var12;
      var12.AH0(var8);
      var12.uf("faq-content");
      fy_2 var14 = new fy_2();
      this.UB0 = var14;
      var14.x40(XZ.BC0(var14.lo0(), new ya_1[]{var14.H10().qd(10).LPt3(new le0_2[]{var12})}, var14).Xq(new ya_1[]{var14.lo0().LPt3(new le0_2[]{var12})}));
      this.SL(var14);
   }

   public static void z70(StringBuilder var0, String var1) {
      Ij(var0, "default", null, var1);
   }

   public static void Ij(StringBuilder var0, String var1, String var2, String var3) {
      var0.append("<div style=\"margin: 5px; word-wrap: break-word;");
      var0.append(" font-family: ");
      var0.append(var1);
      var0.append(";");
      if (var2 != null) {
         var0.append(" width: auto; padding: 8px; background-image: ");
         var0.append(var2);
         var0.append(";");
      }

      var0.append(" \\\">");
      var0.append(var3);
      var0.append("</div>");
   }

   public final void x00() {
      lpt6__0.v90(this);
   }

   public final boolean nd0(i70_0 var1) {
      if (E00.ZU(var1.zu) && var1.iT()) {
         int var2 = var1.finally$;
         rp_0 var3 = rp_0.kC0;
         if (var3 != null && var3.Ov(var2)) {
            lo0_0 var4 = this.O;
            var4.Xr0(var4.g1.VP - 10);
            return true;
         }

         var3 = rp_0.synchronized$;
         if (var3 != null && var3.Ov(var2)) {
            lo0_0 var5 = this.O;
            var5.Xr0(var5.g1.VP + 10);
            return true;
         }

         var3 = rp_0.nK0;
         if (var3 != null && var3.Ov(var2)) {
            this.com5.We(false);
            return true;
         }
      }

      return super.nd0(var1);
   }

   public final void K8() {
      super.K8();
      this.RY(640, 480);
      this.oY(640, 480);
      this.UB0.oY(635, 440);
   }

   public final String Ns(String var1, String var2) {
      xe_1 var3 = new xe_1(var1);
      var3.uf("button");
      var3.RR(new bx0(var2));
      int var4 = this.XF++;
      this.native$.wR(var3, "btn" + var4);
      return fp0_0.uD(new StringBuilder("<button name=\"btn"), var4, "\" style=\"margin: 0px\"/>");
   }
}
