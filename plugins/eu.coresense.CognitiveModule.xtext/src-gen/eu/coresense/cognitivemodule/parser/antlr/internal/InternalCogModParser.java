package eu.coresense.cognitivemodule.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.cognitivemodule.services.CogModGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCogModParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Afferent", "Coupling", "Efferent", "Topic", "Core", "Meta", "Type", "Colon", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Meta=9;
    public static final int RULE_END=13;
    public static final int RULE_BEGIN=12;
    public static final int Efferent=6;
    public static final int Afferent=4;
    public static final int RULE_STRING=16;
    public static final int RULE_SL_COMMENT=18;
    public static final int Coupling=5;
    public static final int Colon=11;
    public static final int Topic=7;
    public static final int EOF=-1;
    public static final int Core=8;
    public static final int RULE_ID=14;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int Type=10;
    public static final int RULE_INT=15;
    public static final int RULE_ML_COMMENT=17;

    // delegates
    // delegators


        public InternalCogModParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCogModParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCogModParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCogModParser.g"; }



     	private CogModGrammarAccess grammarAccess;

        public InternalCogModParser(TokenStream input, CogModGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CognitiveModule";
       	}

       	@Override
       	protected CogModGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCognitiveModule"
    // InternalCogModParser.g:57:1: entryRuleCognitiveModule returns [EObject current=null] : iv_ruleCognitiveModule= ruleCognitiveModule EOF ;
    public final EObject entryRuleCognitiveModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCognitiveModule = null;


        try {
            // InternalCogModParser.g:57:56: (iv_ruleCognitiveModule= ruleCognitiveModule EOF )
            // InternalCogModParser.g:58:2: iv_ruleCognitiveModule= ruleCognitiveModule EOF
            {
             newCompositeNode(grammarAccess.getCognitiveModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCognitiveModule=ruleCognitiveModule();

            state._fsp--;

             current =iv_ruleCognitiveModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCognitiveModule"


    // $ANTLR start "ruleCognitiveModule"
    // InternalCogModParser.g:64:1: ruleCognitiveModule returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Core ( (lv_core_5_0= ruleCore ) ) (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )? (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )? otherlv_14= Meta ( (lv_meta_15_0= ruleMeta ) ) otherlv_16= Coupling ( (lv_coupling_17_0= ruleCoupling ) ) this_END_18= RULE_END ) ;
    public final EObject ruleCognitiveModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token this_END_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_core_5_0 = null;

        EObject lv_efferent_8_0 = null;

        EObject lv_afferent_12_0 = null;

        EObject lv_meta_15_0 = null;

        EObject lv_coupling_17_0 = null;



        	enterRule();

        try {
            // InternalCogModParser.g:70:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Core ( (lv_core_5_0= ruleCore ) ) (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )? (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )? otherlv_14= Meta ( (lv_meta_15_0= ruleMeta ) ) otherlv_16= Coupling ( (lv_coupling_17_0= ruleCoupling ) ) this_END_18= RULE_END ) )
            // InternalCogModParser.g:71:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Core ( (lv_core_5_0= ruleCore ) ) (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )? (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )? otherlv_14= Meta ( (lv_meta_15_0= ruleMeta ) ) otherlv_16= Coupling ( (lv_coupling_17_0= ruleCoupling ) ) this_END_18= RULE_END )
            {
            // InternalCogModParser.g:71:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Core ( (lv_core_5_0= ruleCore ) ) (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )? (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )? otherlv_14= Meta ( (lv_meta_15_0= ruleMeta ) ) otherlv_16= Coupling ( (lv_coupling_17_0= ruleCoupling ) ) this_END_18= RULE_END )
            // InternalCogModParser.g:72:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Core ( (lv_core_5_0= ruleCore ) ) (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )? (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )? otherlv_14= Meta ( (lv_meta_15_0= ruleMeta ) ) otherlv_16= Coupling ( (lv_coupling_17_0= ruleCoupling ) ) this_END_18= RULE_END
            {
            // InternalCogModParser.g:72:3: ()
            // InternalCogModParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCognitiveModuleAccess().getCognitiveModuleAction_0(),
            					current);
            			

            }

            // InternalCogModParser.g:79:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCogModParser.g:80:4: (lv_name_1_0= ruleEString )
            {
            // InternalCogModParser.g:80:4: (lv_name_1_0= ruleEString )
            // InternalCogModParser.g:81:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCognitiveModuleAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Core,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCognitiveModuleAccess().getCoreKeyword_4());
            		
            // InternalCogModParser.g:110:3: ( (lv_core_5_0= ruleCore ) )
            // InternalCogModParser.g:111:4: (lv_core_5_0= ruleCore )
            {
            // InternalCogModParser.g:111:4: (lv_core_5_0= ruleCore )
            // InternalCogModParser.g:112:5: lv_core_5_0= ruleCore
            {

            					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getCoreCoreParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_core_5_0=ruleCore();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
            					}
            					set(
            						current,
            						"core",
            						lv_core_5_0,
            						"eu.coresense.cognitivemodule.CogMod.Core");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCogModParser.g:129:3: (otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Efferent) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCogModParser.g:130:4: otherlv_6= Efferent this_BEGIN_7= RULE_BEGIN ( (lv_efferent_8_0= ruleModelet ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Efferent,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCognitiveModuleAccess().getEfferentKeyword_6_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_6_1());
                    			
                    // InternalCogModParser.g:138:4: ( (lv_efferent_8_0= ruleModelet ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCogModParser.g:139:5: (lv_efferent_8_0= ruleModelet )
                    	    {
                    	    // InternalCogModParser.g:139:5: (lv_efferent_8_0= ruleModelet )
                    	    // InternalCogModParser.g:140:6: lv_efferent_8_0= ruleModelet
                    	    {

                    	    						newCompositeNode(grammarAccess.getCognitiveModuleAccess().getEfferentModeletParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_efferent_8_0=ruleModelet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"efferent",
                    	    							lv_efferent_8_0,
                    	    							"eu.coresense.cognitivemodule.CogMod.Modelet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_9); 

                    				newLeafNode(this_END_9, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalCogModParser.g:162:3: (otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Afferent) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCogModParser.g:163:4: otherlv_10= Afferent this_BEGIN_11= RULE_BEGIN ( (lv_afferent_12_0= ruleModelet ) )* this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,Afferent,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCognitiveModuleAccess().getAfferentKeyword_7_0());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_7_1());
                    			
                    // InternalCogModParser.g:171:4: ( (lv_afferent_12_0= ruleModelet ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCogModParser.g:172:5: (lv_afferent_12_0= ruleModelet )
                    	    {
                    	    // InternalCogModParser.g:172:5: (lv_afferent_12_0= ruleModelet )
                    	    // InternalCogModParser.g:173:6: lv_afferent_12_0= ruleModelet
                    	    {

                    	    						newCompositeNode(grammarAccess.getCognitiveModuleAccess().getAfferentModeletParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_afferent_12_0=ruleModelet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"afferent",
                    	    							lv_afferent_12_0,
                    	    							"eu.coresense.cognitivemodule.CogMod.Modelet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_10); 

                    				newLeafNode(this_END_13, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,Meta,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getCognitiveModuleAccess().getMetaKeyword_8());
            		
            // InternalCogModParser.g:199:3: ( (lv_meta_15_0= ruleMeta ) )
            // InternalCogModParser.g:200:4: (lv_meta_15_0= ruleMeta )
            {
            // InternalCogModParser.g:200:4: (lv_meta_15_0= ruleMeta )
            // InternalCogModParser.g:201:5: lv_meta_15_0= ruleMeta
            {

            					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getMetaMetaParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_meta_15_0=ruleMeta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
            					}
            					set(
            						current,
            						"meta",
            						lv_meta_15_0,
            						"eu.coresense.cognitivemodule.CogMod.Meta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,Coupling,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getCognitiveModuleAccess().getCouplingKeyword_10());
            		
            // InternalCogModParser.g:222:3: ( (lv_coupling_17_0= ruleCoupling ) )
            // InternalCogModParser.g:223:4: (lv_coupling_17_0= ruleCoupling )
            {
            // InternalCogModParser.g:223:4: (lv_coupling_17_0= ruleCoupling )
            // InternalCogModParser.g:224:5: lv_coupling_17_0= ruleCoupling
            {

            					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getCouplingCouplingParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_coupling_17_0=ruleCoupling();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
            					}
            					set(
            						current,
            						"coupling",
            						lv_coupling_17_0,
            						"eu.coresense.cognitivemodule.CogMod.Coupling");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_18=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_18, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCognitiveModule"


    // $ANTLR start "entryRuleEString"
    // InternalCogModParser.g:249:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCogModParser.g:249:47: (iv_ruleEString= ruleEString EOF )
            // InternalCogModParser.g:250:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCogModParser.g:256:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCogModParser.g:262:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCogModParser.g:263:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCogModParser.g:263:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCogModParser.g:264:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCogModParser.g:272:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCore"
    // InternalCogModParser.g:283:1: entryRuleCore returns [EObject current=null] : iv_ruleCore= ruleCore EOF ;
    public final EObject entryRuleCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCore = null;


        try {
            // InternalCogModParser.g:283:45: (iv_ruleCore= ruleCore EOF )
            // InternalCogModParser.g:284:2: iv_ruleCore= ruleCore EOF
            {
             newCompositeNode(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCore=ruleCore();

            state._fsp--;

             current =iv_ruleCore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalCogModParser.g:290:1: ruleCore returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCore() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCogModParser.g:296:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCogModParser.g:297:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCogModParser.g:297:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCogModParser.g:298:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCogModParser.g:298:3: ()
            // InternalCogModParser.g:299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCoreAccess().getCoreAction_0(),
            					current);
            			

            }

            // InternalCogModParser.g:305:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCogModParser.g:306:4: (lv_name_1_0= ruleEString )
            {
            // InternalCogModParser.g:306:4: (lv_name_1_0= ruleEString )
            // InternalCogModParser.g:307:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoreAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleModelet"
    // InternalCogModParser.g:328:1: entryRuleModelet returns [EObject current=null] : iv_ruleModelet= ruleModelet EOF ;
    public final EObject entryRuleModelet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelet = null;


        try {
            // InternalCogModParser.g:328:48: (iv_ruleModelet= ruleModelet EOF )
            // InternalCogModParser.g:329:2: iv_ruleModelet= ruleModelet EOF
            {
             newCompositeNode(grammarAccess.getModeletRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelet=ruleModelet();

            state._fsp--;

             current =iv_ruleModelet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelet"


    // $ANTLR start "ruleModelet"
    // InternalCogModParser.g:335:1: ruleModelet returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN otherlv_3= Topic ( (lv_topic_4_0= ruleEString ) ) otherlv_5= Type ( (lv_type_6_0= ruleEString ) ) this_END_7= RULE_END ) ;
    public final EObject ruleModelet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_topic_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalCogModParser.g:341:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN otherlv_3= Topic ( (lv_topic_4_0= ruleEString ) ) otherlv_5= Type ( (lv_type_6_0= ruleEString ) ) this_END_7= RULE_END ) )
            // InternalCogModParser.g:342:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN otherlv_3= Topic ( (lv_topic_4_0= ruleEString ) ) otherlv_5= Type ( (lv_type_6_0= ruleEString ) ) this_END_7= RULE_END )
            {
            // InternalCogModParser.g:342:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN otherlv_3= Topic ( (lv_topic_4_0= ruleEString ) ) otherlv_5= Type ( (lv_type_6_0= ruleEString ) ) this_END_7= RULE_END )
            // InternalCogModParser.g:343:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN otherlv_3= Topic ( (lv_topic_4_0= ruleEString ) ) otherlv_5= Type ( (lv_type_6_0= ruleEString ) ) this_END_7= RULE_END
            {
            // InternalCogModParser.g:343:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCogModParser.g:344:4: (lv_name_0_0= ruleEString )
            {
            // InternalCogModParser.g:344:4: (lv_name_0_0= ruleEString )
            // InternalCogModParser.g:345:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModeletAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeletRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModeletAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getModeletAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Topic,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModeletAccess().getTopicKeyword_3());
            		
            // InternalCogModParser.g:374:3: ( (lv_topic_4_0= ruleEString ) )
            // InternalCogModParser.g:375:4: (lv_topic_4_0= ruleEString )
            {
            // InternalCogModParser.g:375:4: (lv_topic_4_0= ruleEString )
            // InternalCogModParser.g:376:5: lv_topic_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModeletAccess().getTopicEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_topic_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeletRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_4_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getModeletAccess().getTypeKeyword_5());
            		
            // InternalCogModParser.g:397:3: ( (lv_type_6_0= ruleEString ) )
            // InternalCogModParser.g:398:4: (lv_type_6_0= ruleEString )
            {
            // InternalCogModParser.g:398:4: (lv_type_6_0= ruleEString )
            // InternalCogModParser.g:399:5: lv_type_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModeletAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModeletRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getModeletAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelet"


    // $ANTLR start "entryRuleMeta"
    // InternalCogModParser.g:424:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // InternalCogModParser.g:424:45: (iv_ruleMeta= ruleMeta EOF )
            // InternalCogModParser.g:425:2: iv_ruleMeta= ruleMeta EOF
            {
             newCompositeNode(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeta=ruleMeta();

            state._fsp--;

             current =iv_ruleMeta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalCogModParser.g:431:1: ruleMeta returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleMeta() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCogModParser.g:437:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCogModParser.g:438:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCogModParser.g:438:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCogModParser.g:439:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCogModParser.g:439:3: ()
            // InternalCogModParser.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaAccess().getMetaAction_0(),
            					current);
            			

            }

            // InternalCogModParser.g:446:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCogModParser.g:447:4: (lv_name_1_0= ruleEString )
            {
            // InternalCogModParser.g:447:4: (lv_name_1_0= ruleEString )
            // InternalCogModParser.g:448:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleCoupling"
    // InternalCogModParser.g:469:1: entryRuleCoupling returns [EObject current=null] : iv_ruleCoupling= ruleCoupling EOF ;
    public final EObject entryRuleCoupling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoupling = null;


        try {
            // InternalCogModParser.g:469:49: (iv_ruleCoupling= ruleCoupling EOF )
            // InternalCogModParser.g:470:2: iv_ruleCoupling= ruleCoupling EOF
            {
             newCompositeNode(grammarAccess.getCouplingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoupling=ruleCoupling();

            state._fsp--;

             current =iv_ruleCoupling; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoupling"


    // $ANTLR start "ruleCoupling"
    // InternalCogModParser.g:476:1: ruleCoupling returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleCoupling() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCogModParser.g:482:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalCogModParser.g:483:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalCogModParser.g:483:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalCogModParser.g:484:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalCogModParser.g:484:3: ()
            // InternalCogModParser.g:485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCouplingAccess().getCouplingAction_0(),
            					current);
            			

            }

            // InternalCogModParser.g:491:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCogModParser.g:492:4: (lv_name_1_0= ruleEString )
            {
            // InternalCogModParser.g:492:4: (lv_name_1_0= ruleEString )
            // InternalCogModParser.g:493:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCouplingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCouplingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eu.coresense.cognitivemodule.CogMod.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoupling"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});

}