package eu.coresense.cognitivemodule.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import eu.coresense.cognitivemodule.services.CogModGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCogModParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Core", "'core:'");
    		tokenNameToValue.put("Meta", "'meta:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Topic", "'topic:'");
    		tokenNameToValue.put("Afferent", "'afferent:'");
    		tokenNameToValue.put("Coupling", "'coupling:'");
    		tokenNameToValue.put("Efferent", "'efferent:'");
    	}

    	public void setGrammarAccess(CogModGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleCognitiveModule"
    // InternalCogModParser.g:63:1: entryRuleCognitiveModule : ruleCognitiveModule EOF ;
    public final void entryRuleCognitiveModule() throws RecognitionException {
        try {
            // InternalCogModParser.g:64:1: ( ruleCognitiveModule EOF )
            // InternalCogModParser.g:65:1: ruleCognitiveModule EOF
            {
             before(grammarAccess.getCognitiveModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleCognitiveModule();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCognitiveModule"


    // $ANTLR start "ruleCognitiveModule"
    // InternalCogModParser.g:72:1: ruleCognitiveModule : ( ( rule__CognitiveModule__Group__0 ) ) ;
    public final void ruleCognitiveModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:76:2: ( ( ( rule__CognitiveModule__Group__0 ) ) )
            // InternalCogModParser.g:77:2: ( ( rule__CognitiveModule__Group__0 ) )
            {
            // InternalCogModParser.g:77:2: ( ( rule__CognitiveModule__Group__0 ) )
            // InternalCogModParser.g:78:3: ( rule__CognitiveModule__Group__0 )
            {
             before(grammarAccess.getCognitiveModuleAccess().getGroup()); 
            // InternalCogModParser.g:79:3: ( rule__CognitiveModule__Group__0 )
            // InternalCogModParser.g:79:4: rule__CognitiveModule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCognitiveModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCognitiveModule"


    // $ANTLR start "entryRuleEString"
    // InternalCogModParser.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCogModParser.g:89:1: ( ruleEString EOF )
            // InternalCogModParser.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCogModParser.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCogModParser.g:102:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCogModParser.g:102:2: ( ( rule__EString__Alternatives ) )
            // InternalCogModParser.g:103:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCogModParser.g:104:3: ( rule__EString__Alternatives )
            // InternalCogModParser.g:104:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCore"
    // InternalCogModParser.g:113:1: entryRuleCore : ruleCore EOF ;
    public final void entryRuleCore() throws RecognitionException {
        try {
            // InternalCogModParser.g:114:1: ( ruleCore EOF )
            // InternalCogModParser.g:115:1: ruleCore EOF
            {
             before(grammarAccess.getCoreRule()); 
            pushFollow(FOLLOW_1);
            ruleCore();

            state._fsp--;

             after(grammarAccess.getCoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCore"


    // $ANTLR start "ruleCore"
    // InternalCogModParser.g:122:1: ruleCore : ( ( rule__Core__Group__0 ) ) ;
    public final void ruleCore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:126:2: ( ( ( rule__Core__Group__0 ) ) )
            // InternalCogModParser.g:127:2: ( ( rule__Core__Group__0 ) )
            {
            // InternalCogModParser.g:127:2: ( ( rule__Core__Group__0 ) )
            // InternalCogModParser.g:128:3: ( rule__Core__Group__0 )
            {
             before(grammarAccess.getCoreAccess().getGroup()); 
            // InternalCogModParser.g:129:3: ( rule__Core__Group__0 )
            // InternalCogModParser.g:129:4: rule__Core__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Core__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCore"


    // $ANTLR start "entryRuleModelet"
    // InternalCogModParser.g:138:1: entryRuleModelet : ruleModelet EOF ;
    public final void entryRuleModelet() throws RecognitionException {
        try {
            // InternalCogModParser.g:139:1: ( ruleModelet EOF )
            // InternalCogModParser.g:140:1: ruleModelet EOF
            {
             before(grammarAccess.getModeletRule()); 
            pushFollow(FOLLOW_1);
            ruleModelet();

            state._fsp--;

             after(grammarAccess.getModeletRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelet"


    // $ANTLR start "ruleModelet"
    // InternalCogModParser.g:147:1: ruleModelet : ( ( rule__Modelet__Group__0 ) ) ;
    public final void ruleModelet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:151:2: ( ( ( rule__Modelet__Group__0 ) ) )
            // InternalCogModParser.g:152:2: ( ( rule__Modelet__Group__0 ) )
            {
            // InternalCogModParser.g:152:2: ( ( rule__Modelet__Group__0 ) )
            // InternalCogModParser.g:153:3: ( rule__Modelet__Group__0 )
            {
             before(grammarAccess.getModeletAccess().getGroup()); 
            // InternalCogModParser.g:154:3: ( rule__Modelet__Group__0 )
            // InternalCogModParser.g:154:4: rule__Modelet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modelet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModeletAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelet"


    // $ANTLR start "entryRuleMeta"
    // InternalCogModParser.g:163:1: entryRuleMeta : ruleMeta EOF ;
    public final void entryRuleMeta() throws RecognitionException {
        try {
            // InternalCogModParser.g:164:1: ( ruleMeta EOF )
            // InternalCogModParser.g:165:1: ruleMeta EOF
            {
             before(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_1);
            ruleMeta();

            state._fsp--;

             after(grammarAccess.getMetaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // InternalCogModParser.g:172:1: ruleMeta : ( ( rule__Meta__Group__0 ) ) ;
    public final void ruleMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:176:2: ( ( ( rule__Meta__Group__0 ) ) )
            // InternalCogModParser.g:177:2: ( ( rule__Meta__Group__0 ) )
            {
            // InternalCogModParser.g:177:2: ( ( rule__Meta__Group__0 ) )
            // InternalCogModParser.g:178:3: ( rule__Meta__Group__0 )
            {
             before(grammarAccess.getMetaAccess().getGroup()); 
            // InternalCogModParser.g:179:3: ( rule__Meta__Group__0 )
            // InternalCogModParser.g:179:4: rule__Meta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleCoupling"
    // InternalCogModParser.g:188:1: entryRuleCoupling : ruleCoupling EOF ;
    public final void entryRuleCoupling() throws RecognitionException {
        try {
            // InternalCogModParser.g:189:1: ( ruleCoupling EOF )
            // InternalCogModParser.g:190:1: ruleCoupling EOF
            {
             before(grammarAccess.getCouplingRule()); 
            pushFollow(FOLLOW_1);
            ruleCoupling();

            state._fsp--;

             after(grammarAccess.getCouplingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoupling"


    // $ANTLR start "ruleCoupling"
    // InternalCogModParser.g:197:1: ruleCoupling : ( ( rule__Coupling__Group__0 ) ) ;
    public final void ruleCoupling() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:201:2: ( ( ( rule__Coupling__Group__0 ) ) )
            // InternalCogModParser.g:202:2: ( ( rule__Coupling__Group__0 ) )
            {
            // InternalCogModParser.g:202:2: ( ( rule__Coupling__Group__0 ) )
            // InternalCogModParser.g:203:3: ( rule__Coupling__Group__0 )
            {
             before(grammarAccess.getCouplingAccess().getGroup()); 
            // InternalCogModParser.g:204:3: ( rule__Coupling__Group__0 )
            // InternalCogModParser.g:204:4: rule__Coupling__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coupling__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCouplingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoupling"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCogModParser.g:212:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:216:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCogModParser.g:217:2: ( RULE_STRING )
                    {
                    // InternalCogModParser.g:217:2: ( RULE_STRING )
                    // InternalCogModParser.g:218:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCogModParser.g:223:2: ( RULE_ID )
                    {
                    // InternalCogModParser.g:223:2: ( RULE_ID )
                    // InternalCogModParser.g:224:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CognitiveModule__Group__0"
    // InternalCogModParser.g:233:1: rule__CognitiveModule__Group__0 : rule__CognitiveModule__Group__0__Impl rule__CognitiveModule__Group__1 ;
    public final void rule__CognitiveModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:237:1: ( rule__CognitiveModule__Group__0__Impl rule__CognitiveModule__Group__1 )
            // InternalCogModParser.g:238:2: rule__CognitiveModule__Group__0__Impl rule__CognitiveModule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CognitiveModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__0"


    // $ANTLR start "rule__CognitiveModule__Group__0__Impl"
    // InternalCogModParser.g:245:1: rule__CognitiveModule__Group__0__Impl : ( () ) ;
    public final void rule__CognitiveModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:249:1: ( ( () ) )
            // InternalCogModParser.g:250:1: ( () )
            {
            // InternalCogModParser.g:250:1: ( () )
            // InternalCogModParser.g:251:2: ()
            {
             before(grammarAccess.getCognitiveModuleAccess().getCognitiveModuleAction_0()); 
            // InternalCogModParser.g:252:2: ()
            // InternalCogModParser.g:252:3: 
            {
            }

             after(grammarAccess.getCognitiveModuleAccess().getCognitiveModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__0__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__1"
    // InternalCogModParser.g:260:1: rule__CognitiveModule__Group__1 : rule__CognitiveModule__Group__1__Impl rule__CognitiveModule__Group__2 ;
    public final void rule__CognitiveModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:264:1: ( rule__CognitiveModule__Group__1__Impl rule__CognitiveModule__Group__2 )
            // InternalCogModParser.g:265:2: rule__CognitiveModule__Group__1__Impl rule__CognitiveModule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CognitiveModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__1"


    // $ANTLR start "rule__CognitiveModule__Group__1__Impl"
    // InternalCogModParser.g:272:1: rule__CognitiveModule__Group__1__Impl : ( ( rule__CognitiveModule__NameAssignment_1 ) ) ;
    public final void rule__CognitiveModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:276:1: ( ( ( rule__CognitiveModule__NameAssignment_1 ) ) )
            // InternalCogModParser.g:277:1: ( ( rule__CognitiveModule__NameAssignment_1 ) )
            {
            // InternalCogModParser.g:277:1: ( ( rule__CognitiveModule__NameAssignment_1 ) )
            // InternalCogModParser.g:278:2: ( rule__CognitiveModule__NameAssignment_1 )
            {
             before(grammarAccess.getCognitiveModuleAccess().getNameAssignment_1()); 
            // InternalCogModParser.g:279:2: ( rule__CognitiveModule__NameAssignment_1 )
            // InternalCogModParser.g:279:3: rule__CognitiveModule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCognitiveModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__1__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__2"
    // InternalCogModParser.g:287:1: rule__CognitiveModule__Group__2 : rule__CognitiveModule__Group__2__Impl rule__CognitiveModule__Group__3 ;
    public final void rule__CognitiveModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:291:1: ( rule__CognitiveModule__Group__2__Impl rule__CognitiveModule__Group__3 )
            // InternalCogModParser.g:292:2: rule__CognitiveModule__Group__2__Impl rule__CognitiveModule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CognitiveModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__2"


    // $ANTLR start "rule__CognitiveModule__Group__2__Impl"
    // InternalCogModParser.g:299:1: rule__CognitiveModule__Group__2__Impl : ( Colon ) ;
    public final void rule__CognitiveModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:303:1: ( ( Colon ) )
            // InternalCogModParser.g:304:1: ( Colon )
            {
            // InternalCogModParser.g:304:1: ( Colon )
            // InternalCogModParser.g:305:2: Colon
            {
             before(grammarAccess.getCognitiveModuleAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__2__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__3"
    // InternalCogModParser.g:314:1: rule__CognitiveModule__Group__3 : rule__CognitiveModule__Group__3__Impl rule__CognitiveModule__Group__4 ;
    public final void rule__CognitiveModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:318:1: ( rule__CognitiveModule__Group__3__Impl rule__CognitiveModule__Group__4 )
            // InternalCogModParser.g:319:2: rule__CognitiveModule__Group__3__Impl rule__CognitiveModule__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CognitiveModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__3"


    // $ANTLR start "rule__CognitiveModule__Group__3__Impl"
    // InternalCogModParser.g:326:1: rule__CognitiveModule__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CognitiveModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:330:1: ( ( RULE_BEGIN ) )
            // InternalCogModParser.g:331:1: ( RULE_BEGIN )
            {
            // InternalCogModParser.g:331:1: ( RULE_BEGIN )
            // InternalCogModParser.g:332:2: RULE_BEGIN
            {
             before(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__3__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__4"
    // InternalCogModParser.g:341:1: rule__CognitiveModule__Group__4 : rule__CognitiveModule__Group__4__Impl rule__CognitiveModule__Group__5 ;
    public final void rule__CognitiveModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:345:1: ( rule__CognitiveModule__Group__4__Impl rule__CognitiveModule__Group__5 )
            // InternalCogModParser.g:346:2: rule__CognitiveModule__Group__4__Impl rule__CognitiveModule__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__CognitiveModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__4"


    // $ANTLR start "rule__CognitiveModule__Group__4__Impl"
    // InternalCogModParser.g:353:1: rule__CognitiveModule__Group__4__Impl : ( Core ) ;
    public final void rule__CognitiveModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:357:1: ( ( Core ) )
            // InternalCogModParser.g:358:1: ( Core )
            {
            // InternalCogModParser.g:358:1: ( Core )
            // InternalCogModParser.g:359:2: Core
            {
             before(grammarAccess.getCognitiveModuleAccess().getCoreKeyword_4()); 
            match(input,Core,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getCoreKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__4__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__5"
    // InternalCogModParser.g:368:1: rule__CognitiveModule__Group__5 : rule__CognitiveModule__Group__5__Impl rule__CognitiveModule__Group__6 ;
    public final void rule__CognitiveModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:372:1: ( rule__CognitiveModule__Group__5__Impl rule__CognitiveModule__Group__6 )
            // InternalCogModParser.g:373:2: rule__CognitiveModule__Group__5__Impl rule__CognitiveModule__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__CognitiveModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__5"


    // $ANTLR start "rule__CognitiveModule__Group__5__Impl"
    // InternalCogModParser.g:380:1: rule__CognitiveModule__Group__5__Impl : ( ( rule__CognitiveModule__CoreAssignment_5 ) ) ;
    public final void rule__CognitiveModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:384:1: ( ( ( rule__CognitiveModule__CoreAssignment_5 ) ) )
            // InternalCogModParser.g:385:1: ( ( rule__CognitiveModule__CoreAssignment_5 ) )
            {
            // InternalCogModParser.g:385:1: ( ( rule__CognitiveModule__CoreAssignment_5 ) )
            // InternalCogModParser.g:386:2: ( rule__CognitiveModule__CoreAssignment_5 )
            {
             before(grammarAccess.getCognitiveModuleAccess().getCoreAssignment_5()); 
            // InternalCogModParser.g:387:2: ( rule__CognitiveModule__CoreAssignment_5 )
            // InternalCogModParser.g:387:3: rule__CognitiveModule__CoreAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__CoreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCognitiveModuleAccess().getCoreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__5__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__6"
    // InternalCogModParser.g:395:1: rule__CognitiveModule__Group__6 : rule__CognitiveModule__Group__6__Impl rule__CognitiveModule__Group__7 ;
    public final void rule__CognitiveModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:399:1: ( rule__CognitiveModule__Group__6__Impl rule__CognitiveModule__Group__7 )
            // InternalCogModParser.g:400:2: rule__CognitiveModule__Group__6__Impl rule__CognitiveModule__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__CognitiveModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__6"


    // $ANTLR start "rule__CognitiveModule__Group__6__Impl"
    // InternalCogModParser.g:407:1: rule__CognitiveModule__Group__6__Impl : ( ( rule__CognitiveModule__Group_6__0 )? ) ;
    public final void rule__CognitiveModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:411:1: ( ( ( rule__CognitiveModule__Group_6__0 )? ) )
            // InternalCogModParser.g:412:1: ( ( rule__CognitiveModule__Group_6__0 )? )
            {
            // InternalCogModParser.g:412:1: ( ( rule__CognitiveModule__Group_6__0 )? )
            // InternalCogModParser.g:413:2: ( rule__CognitiveModule__Group_6__0 )?
            {
             before(grammarAccess.getCognitiveModuleAccess().getGroup_6()); 
            // InternalCogModParser.g:414:2: ( rule__CognitiveModule__Group_6__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Efferent) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCogModParser.g:414:3: rule__CognitiveModule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CognitiveModule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCognitiveModuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__6__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__7"
    // InternalCogModParser.g:422:1: rule__CognitiveModule__Group__7 : rule__CognitiveModule__Group__7__Impl rule__CognitiveModule__Group__8 ;
    public final void rule__CognitiveModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:426:1: ( rule__CognitiveModule__Group__7__Impl rule__CognitiveModule__Group__8 )
            // InternalCogModParser.g:427:2: rule__CognitiveModule__Group__7__Impl rule__CognitiveModule__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__CognitiveModule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__7"


    // $ANTLR start "rule__CognitiveModule__Group__7__Impl"
    // InternalCogModParser.g:434:1: rule__CognitiveModule__Group__7__Impl : ( ( rule__CognitiveModule__Group_7__0 )? ) ;
    public final void rule__CognitiveModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:438:1: ( ( ( rule__CognitiveModule__Group_7__0 )? ) )
            // InternalCogModParser.g:439:1: ( ( rule__CognitiveModule__Group_7__0 )? )
            {
            // InternalCogModParser.g:439:1: ( ( rule__CognitiveModule__Group_7__0 )? )
            // InternalCogModParser.g:440:2: ( rule__CognitiveModule__Group_7__0 )?
            {
             before(grammarAccess.getCognitiveModuleAccess().getGroup_7()); 
            // InternalCogModParser.g:441:2: ( rule__CognitiveModule__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Afferent) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCogModParser.g:441:3: rule__CognitiveModule__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CognitiveModule__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCognitiveModuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__7__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__8"
    // InternalCogModParser.g:449:1: rule__CognitiveModule__Group__8 : rule__CognitiveModule__Group__8__Impl rule__CognitiveModule__Group__9 ;
    public final void rule__CognitiveModule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:453:1: ( rule__CognitiveModule__Group__8__Impl rule__CognitiveModule__Group__9 )
            // InternalCogModParser.g:454:2: rule__CognitiveModule__Group__8__Impl rule__CognitiveModule__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__CognitiveModule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__8"


    // $ANTLR start "rule__CognitiveModule__Group__8__Impl"
    // InternalCogModParser.g:461:1: rule__CognitiveModule__Group__8__Impl : ( Meta ) ;
    public final void rule__CognitiveModule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:465:1: ( ( Meta ) )
            // InternalCogModParser.g:466:1: ( Meta )
            {
            // InternalCogModParser.g:466:1: ( Meta )
            // InternalCogModParser.g:467:2: Meta
            {
             before(grammarAccess.getCognitiveModuleAccess().getMetaKeyword_8()); 
            match(input,Meta,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getMetaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__8__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__9"
    // InternalCogModParser.g:476:1: rule__CognitiveModule__Group__9 : rule__CognitiveModule__Group__9__Impl rule__CognitiveModule__Group__10 ;
    public final void rule__CognitiveModule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:480:1: ( rule__CognitiveModule__Group__9__Impl rule__CognitiveModule__Group__10 )
            // InternalCogModParser.g:481:2: rule__CognitiveModule__Group__9__Impl rule__CognitiveModule__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__CognitiveModule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__9"


    // $ANTLR start "rule__CognitiveModule__Group__9__Impl"
    // InternalCogModParser.g:488:1: rule__CognitiveModule__Group__9__Impl : ( ( rule__CognitiveModule__MetaAssignment_9 ) ) ;
    public final void rule__CognitiveModule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:492:1: ( ( ( rule__CognitiveModule__MetaAssignment_9 ) ) )
            // InternalCogModParser.g:493:1: ( ( rule__CognitiveModule__MetaAssignment_9 ) )
            {
            // InternalCogModParser.g:493:1: ( ( rule__CognitiveModule__MetaAssignment_9 ) )
            // InternalCogModParser.g:494:2: ( rule__CognitiveModule__MetaAssignment_9 )
            {
             before(grammarAccess.getCognitiveModuleAccess().getMetaAssignment_9()); 
            // InternalCogModParser.g:495:2: ( rule__CognitiveModule__MetaAssignment_9 )
            // InternalCogModParser.g:495:3: rule__CognitiveModule__MetaAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__MetaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCognitiveModuleAccess().getMetaAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__9__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__10"
    // InternalCogModParser.g:503:1: rule__CognitiveModule__Group__10 : rule__CognitiveModule__Group__10__Impl rule__CognitiveModule__Group__11 ;
    public final void rule__CognitiveModule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:507:1: ( rule__CognitiveModule__Group__10__Impl rule__CognitiveModule__Group__11 )
            // InternalCogModParser.g:508:2: rule__CognitiveModule__Group__10__Impl rule__CognitiveModule__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__CognitiveModule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__10"


    // $ANTLR start "rule__CognitiveModule__Group__10__Impl"
    // InternalCogModParser.g:515:1: rule__CognitiveModule__Group__10__Impl : ( Coupling ) ;
    public final void rule__CognitiveModule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:519:1: ( ( Coupling ) )
            // InternalCogModParser.g:520:1: ( Coupling )
            {
            // InternalCogModParser.g:520:1: ( Coupling )
            // InternalCogModParser.g:521:2: Coupling
            {
             before(grammarAccess.getCognitiveModuleAccess().getCouplingKeyword_10()); 
            match(input,Coupling,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getCouplingKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__10__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__11"
    // InternalCogModParser.g:530:1: rule__CognitiveModule__Group__11 : rule__CognitiveModule__Group__11__Impl rule__CognitiveModule__Group__12 ;
    public final void rule__CognitiveModule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:534:1: ( rule__CognitiveModule__Group__11__Impl rule__CognitiveModule__Group__12 )
            // InternalCogModParser.g:535:2: rule__CognitiveModule__Group__11__Impl rule__CognitiveModule__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__CognitiveModule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__11"


    // $ANTLR start "rule__CognitiveModule__Group__11__Impl"
    // InternalCogModParser.g:542:1: rule__CognitiveModule__Group__11__Impl : ( ( rule__CognitiveModule__CouplingAssignment_11 ) ) ;
    public final void rule__CognitiveModule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:546:1: ( ( ( rule__CognitiveModule__CouplingAssignment_11 ) ) )
            // InternalCogModParser.g:547:1: ( ( rule__CognitiveModule__CouplingAssignment_11 ) )
            {
            // InternalCogModParser.g:547:1: ( ( rule__CognitiveModule__CouplingAssignment_11 ) )
            // InternalCogModParser.g:548:2: ( rule__CognitiveModule__CouplingAssignment_11 )
            {
             before(grammarAccess.getCognitiveModuleAccess().getCouplingAssignment_11()); 
            // InternalCogModParser.g:549:2: ( rule__CognitiveModule__CouplingAssignment_11 )
            // InternalCogModParser.g:549:3: rule__CognitiveModule__CouplingAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__CouplingAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCognitiveModuleAccess().getCouplingAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__11__Impl"


    // $ANTLR start "rule__CognitiveModule__Group__12"
    // InternalCogModParser.g:557:1: rule__CognitiveModule__Group__12 : rule__CognitiveModule__Group__12__Impl ;
    public final void rule__CognitiveModule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:561:1: ( rule__CognitiveModule__Group__12__Impl )
            // InternalCogModParser.g:562:2: rule__CognitiveModule__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__12"


    // $ANTLR start "rule__CognitiveModule__Group__12__Impl"
    // InternalCogModParser.g:568:1: rule__CognitiveModule__Group__12__Impl : ( RULE_END ) ;
    public final void rule__CognitiveModule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:572:1: ( ( RULE_END ) )
            // InternalCogModParser.g:573:1: ( RULE_END )
            {
            // InternalCogModParser.g:573:1: ( RULE_END )
            // InternalCogModParser.g:574:2: RULE_END
            {
             before(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_12()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group__12__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_6__0"
    // InternalCogModParser.g:584:1: rule__CognitiveModule__Group_6__0 : rule__CognitiveModule__Group_6__0__Impl rule__CognitiveModule__Group_6__1 ;
    public final void rule__CognitiveModule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:588:1: ( rule__CognitiveModule__Group_6__0__Impl rule__CognitiveModule__Group_6__1 )
            // InternalCogModParser.g:589:2: rule__CognitiveModule__Group_6__0__Impl rule__CognitiveModule__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__CognitiveModule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__0"


    // $ANTLR start "rule__CognitiveModule__Group_6__0__Impl"
    // InternalCogModParser.g:596:1: rule__CognitiveModule__Group_6__0__Impl : ( Efferent ) ;
    public final void rule__CognitiveModule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:600:1: ( ( Efferent ) )
            // InternalCogModParser.g:601:1: ( Efferent )
            {
            // InternalCogModParser.g:601:1: ( Efferent )
            // InternalCogModParser.g:602:2: Efferent
            {
             before(grammarAccess.getCognitiveModuleAccess().getEfferentKeyword_6_0()); 
            match(input,Efferent,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getEfferentKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__0__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_6__1"
    // InternalCogModParser.g:611:1: rule__CognitiveModule__Group_6__1 : rule__CognitiveModule__Group_6__1__Impl rule__CognitiveModule__Group_6__2 ;
    public final void rule__CognitiveModule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:615:1: ( rule__CognitiveModule__Group_6__1__Impl rule__CognitiveModule__Group_6__2 )
            // InternalCogModParser.g:616:2: rule__CognitiveModule__Group_6__1__Impl rule__CognitiveModule__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__CognitiveModule__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__1"


    // $ANTLR start "rule__CognitiveModule__Group_6__1__Impl"
    // InternalCogModParser.g:623:1: rule__CognitiveModule__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__CognitiveModule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:627:1: ( ( RULE_BEGIN ) )
            // InternalCogModParser.g:628:1: ( RULE_BEGIN )
            {
            // InternalCogModParser.g:628:1: ( RULE_BEGIN )
            // InternalCogModParser.g:629:2: RULE_BEGIN
            {
             before(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_6_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__1__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_6__2"
    // InternalCogModParser.g:638:1: rule__CognitiveModule__Group_6__2 : rule__CognitiveModule__Group_6__2__Impl rule__CognitiveModule__Group_6__3 ;
    public final void rule__CognitiveModule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:642:1: ( rule__CognitiveModule__Group_6__2__Impl rule__CognitiveModule__Group_6__3 )
            // InternalCogModParser.g:643:2: rule__CognitiveModule__Group_6__2__Impl rule__CognitiveModule__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__CognitiveModule__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__2"


    // $ANTLR start "rule__CognitiveModule__Group_6__2__Impl"
    // InternalCogModParser.g:650:1: rule__CognitiveModule__Group_6__2__Impl : ( ( rule__CognitiveModule__EfferentAssignment_6_2 )* ) ;
    public final void rule__CognitiveModule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:654:1: ( ( ( rule__CognitiveModule__EfferentAssignment_6_2 )* ) )
            // InternalCogModParser.g:655:1: ( ( rule__CognitiveModule__EfferentAssignment_6_2 )* )
            {
            // InternalCogModParser.g:655:1: ( ( rule__CognitiveModule__EfferentAssignment_6_2 )* )
            // InternalCogModParser.g:656:2: ( rule__CognitiveModule__EfferentAssignment_6_2 )*
            {
             before(grammarAccess.getCognitiveModuleAccess().getEfferentAssignment_6_2()); 
            // InternalCogModParser.g:657:2: ( rule__CognitiveModule__EfferentAssignment_6_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCogModParser.g:657:3: rule__CognitiveModule__EfferentAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CognitiveModule__EfferentAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCognitiveModuleAccess().getEfferentAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__2__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_6__3"
    // InternalCogModParser.g:665:1: rule__CognitiveModule__Group_6__3 : rule__CognitiveModule__Group_6__3__Impl ;
    public final void rule__CognitiveModule__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:669:1: ( rule__CognitiveModule__Group_6__3__Impl )
            // InternalCogModParser.g:670:2: rule__CognitiveModule__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__3"


    // $ANTLR start "rule__CognitiveModule__Group_6__3__Impl"
    // InternalCogModParser.g:676:1: rule__CognitiveModule__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__CognitiveModule__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:680:1: ( ( RULE_END ) )
            // InternalCogModParser.g:681:1: ( RULE_END )
            {
            // InternalCogModParser.g:681:1: ( RULE_END )
            // InternalCogModParser.g:682:2: RULE_END
            {
             before(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_6_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_6__3__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_7__0"
    // InternalCogModParser.g:692:1: rule__CognitiveModule__Group_7__0 : rule__CognitiveModule__Group_7__0__Impl rule__CognitiveModule__Group_7__1 ;
    public final void rule__CognitiveModule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:696:1: ( rule__CognitiveModule__Group_7__0__Impl rule__CognitiveModule__Group_7__1 )
            // InternalCogModParser.g:697:2: rule__CognitiveModule__Group_7__0__Impl rule__CognitiveModule__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__CognitiveModule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__0"


    // $ANTLR start "rule__CognitiveModule__Group_7__0__Impl"
    // InternalCogModParser.g:704:1: rule__CognitiveModule__Group_7__0__Impl : ( Afferent ) ;
    public final void rule__CognitiveModule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:708:1: ( ( Afferent ) )
            // InternalCogModParser.g:709:1: ( Afferent )
            {
            // InternalCogModParser.g:709:1: ( Afferent )
            // InternalCogModParser.g:710:2: Afferent
            {
             before(grammarAccess.getCognitiveModuleAccess().getAfferentKeyword_7_0()); 
            match(input,Afferent,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getAfferentKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__0__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_7__1"
    // InternalCogModParser.g:719:1: rule__CognitiveModule__Group_7__1 : rule__CognitiveModule__Group_7__1__Impl rule__CognitiveModule__Group_7__2 ;
    public final void rule__CognitiveModule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:723:1: ( rule__CognitiveModule__Group_7__1__Impl rule__CognitiveModule__Group_7__2 )
            // InternalCogModParser.g:724:2: rule__CognitiveModule__Group_7__1__Impl rule__CognitiveModule__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__CognitiveModule__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__1"


    // $ANTLR start "rule__CognitiveModule__Group_7__1__Impl"
    // InternalCogModParser.g:731:1: rule__CognitiveModule__Group_7__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__CognitiveModule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:735:1: ( ( RULE_BEGIN ) )
            // InternalCogModParser.g:736:1: ( RULE_BEGIN )
            {
            // InternalCogModParser.g:736:1: ( RULE_BEGIN )
            // InternalCogModParser.g:737:2: RULE_BEGIN
            {
             before(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_7_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__1__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_7__2"
    // InternalCogModParser.g:746:1: rule__CognitiveModule__Group_7__2 : rule__CognitiveModule__Group_7__2__Impl rule__CognitiveModule__Group_7__3 ;
    public final void rule__CognitiveModule__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:750:1: ( rule__CognitiveModule__Group_7__2__Impl rule__CognitiveModule__Group_7__3 )
            // InternalCogModParser.g:751:2: rule__CognitiveModule__Group_7__2__Impl rule__CognitiveModule__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__CognitiveModule__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__2"


    // $ANTLR start "rule__CognitiveModule__Group_7__2__Impl"
    // InternalCogModParser.g:758:1: rule__CognitiveModule__Group_7__2__Impl : ( ( rule__CognitiveModule__AfferentAssignment_7_2 )* ) ;
    public final void rule__CognitiveModule__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:762:1: ( ( ( rule__CognitiveModule__AfferentAssignment_7_2 )* ) )
            // InternalCogModParser.g:763:1: ( ( rule__CognitiveModule__AfferentAssignment_7_2 )* )
            {
            // InternalCogModParser.g:763:1: ( ( rule__CognitiveModule__AfferentAssignment_7_2 )* )
            // InternalCogModParser.g:764:2: ( rule__CognitiveModule__AfferentAssignment_7_2 )*
            {
             before(grammarAccess.getCognitiveModuleAccess().getAfferentAssignment_7_2()); 
            // InternalCogModParser.g:765:2: ( rule__CognitiveModule__AfferentAssignment_7_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCogModParser.g:765:3: rule__CognitiveModule__AfferentAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CognitiveModule__AfferentAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCognitiveModuleAccess().getAfferentAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__2__Impl"


    // $ANTLR start "rule__CognitiveModule__Group_7__3"
    // InternalCogModParser.g:773:1: rule__CognitiveModule__Group_7__3 : rule__CognitiveModule__Group_7__3__Impl ;
    public final void rule__CognitiveModule__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:777:1: ( rule__CognitiveModule__Group_7__3__Impl )
            // InternalCogModParser.g:778:2: rule__CognitiveModule__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CognitiveModule__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__3"


    // $ANTLR start "rule__CognitiveModule__Group_7__3__Impl"
    // InternalCogModParser.g:784:1: rule__CognitiveModule__Group_7__3__Impl : ( RULE_END ) ;
    public final void rule__CognitiveModule__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:788:1: ( ( RULE_END ) )
            // InternalCogModParser.g:789:1: ( RULE_END )
            {
            // InternalCogModParser.g:789:1: ( RULE_END )
            // InternalCogModParser.g:790:2: RULE_END
            {
             before(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_7_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__Group_7__3__Impl"


    // $ANTLR start "rule__Core__Group__0"
    // InternalCogModParser.g:800:1: rule__Core__Group__0 : rule__Core__Group__0__Impl rule__Core__Group__1 ;
    public final void rule__Core__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:804:1: ( rule__Core__Group__0__Impl rule__Core__Group__1 )
            // InternalCogModParser.g:805:2: rule__Core__Group__0__Impl rule__Core__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Core__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Core__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__0"


    // $ANTLR start "rule__Core__Group__0__Impl"
    // InternalCogModParser.g:812:1: rule__Core__Group__0__Impl : ( () ) ;
    public final void rule__Core__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:816:1: ( ( () ) )
            // InternalCogModParser.g:817:1: ( () )
            {
            // InternalCogModParser.g:817:1: ( () )
            // InternalCogModParser.g:818:2: ()
            {
             before(grammarAccess.getCoreAccess().getCoreAction_0()); 
            // InternalCogModParser.g:819:2: ()
            // InternalCogModParser.g:819:3: 
            {
            }

             after(grammarAccess.getCoreAccess().getCoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__0__Impl"


    // $ANTLR start "rule__Core__Group__1"
    // InternalCogModParser.g:827:1: rule__Core__Group__1 : rule__Core__Group__1__Impl ;
    public final void rule__Core__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:831:1: ( rule__Core__Group__1__Impl )
            // InternalCogModParser.g:832:2: rule__Core__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Core__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__1"


    // $ANTLR start "rule__Core__Group__1__Impl"
    // InternalCogModParser.g:838:1: rule__Core__Group__1__Impl : ( ( rule__Core__NameAssignment_1 ) ) ;
    public final void rule__Core__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:842:1: ( ( ( rule__Core__NameAssignment_1 ) ) )
            // InternalCogModParser.g:843:1: ( ( rule__Core__NameAssignment_1 ) )
            {
            // InternalCogModParser.g:843:1: ( ( rule__Core__NameAssignment_1 ) )
            // InternalCogModParser.g:844:2: ( rule__Core__NameAssignment_1 )
            {
             before(grammarAccess.getCoreAccess().getNameAssignment_1()); 
            // InternalCogModParser.g:845:2: ( rule__Core__NameAssignment_1 )
            // InternalCogModParser.g:845:3: rule__Core__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Core__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__Group__1__Impl"


    // $ANTLR start "rule__Modelet__Group__0"
    // InternalCogModParser.g:854:1: rule__Modelet__Group__0 : rule__Modelet__Group__0__Impl rule__Modelet__Group__1 ;
    public final void rule__Modelet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:858:1: ( rule__Modelet__Group__0__Impl rule__Modelet__Group__1 )
            // InternalCogModParser.g:859:2: rule__Modelet__Group__0__Impl rule__Modelet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Modelet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__0"


    // $ANTLR start "rule__Modelet__Group__0__Impl"
    // InternalCogModParser.g:866:1: rule__Modelet__Group__0__Impl : ( ( rule__Modelet__NameAssignment_0 ) ) ;
    public final void rule__Modelet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:870:1: ( ( ( rule__Modelet__NameAssignment_0 ) ) )
            // InternalCogModParser.g:871:1: ( ( rule__Modelet__NameAssignment_0 ) )
            {
            // InternalCogModParser.g:871:1: ( ( rule__Modelet__NameAssignment_0 ) )
            // InternalCogModParser.g:872:2: ( rule__Modelet__NameAssignment_0 )
            {
             before(grammarAccess.getModeletAccess().getNameAssignment_0()); 
            // InternalCogModParser.g:873:2: ( rule__Modelet__NameAssignment_0 )
            // InternalCogModParser.g:873:3: rule__Modelet__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Modelet__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModeletAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__0__Impl"


    // $ANTLR start "rule__Modelet__Group__1"
    // InternalCogModParser.g:881:1: rule__Modelet__Group__1 : rule__Modelet__Group__1__Impl rule__Modelet__Group__2 ;
    public final void rule__Modelet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:885:1: ( rule__Modelet__Group__1__Impl rule__Modelet__Group__2 )
            // InternalCogModParser.g:886:2: rule__Modelet__Group__1__Impl rule__Modelet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Modelet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__1"


    // $ANTLR start "rule__Modelet__Group__1__Impl"
    // InternalCogModParser.g:893:1: rule__Modelet__Group__1__Impl : ( Colon ) ;
    public final void rule__Modelet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:897:1: ( ( Colon ) )
            // InternalCogModParser.g:898:1: ( Colon )
            {
            // InternalCogModParser.g:898:1: ( Colon )
            // InternalCogModParser.g:899:2: Colon
            {
             before(grammarAccess.getModeletAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getModeletAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__1__Impl"


    // $ANTLR start "rule__Modelet__Group__2"
    // InternalCogModParser.g:908:1: rule__Modelet__Group__2 : rule__Modelet__Group__2__Impl rule__Modelet__Group__3 ;
    public final void rule__Modelet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:912:1: ( rule__Modelet__Group__2__Impl rule__Modelet__Group__3 )
            // InternalCogModParser.g:913:2: rule__Modelet__Group__2__Impl rule__Modelet__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Modelet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__2"


    // $ANTLR start "rule__Modelet__Group__2__Impl"
    // InternalCogModParser.g:920:1: rule__Modelet__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Modelet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:924:1: ( ( RULE_BEGIN ) )
            // InternalCogModParser.g:925:1: ( RULE_BEGIN )
            {
            // InternalCogModParser.g:925:1: ( RULE_BEGIN )
            // InternalCogModParser.g:926:2: RULE_BEGIN
            {
             before(grammarAccess.getModeletAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getModeletAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__2__Impl"


    // $ANTLR start "rule__Modelet__Group__3"
    // InternalCogModParser.g:935:1: rule__Modelet__Group__3 : rule__Modelet__Group__3__Impl rule__Modelet__Group__4 ;
    public final void rule__Modelet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:939:1: ( rule__Modelet__Group__3__Impl rule__Modelet__Group__4 )
            // InternalCogModParser.g:940:2: rule__Modelet__Group__3__Impl rule__Modelet__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Modelet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__3"


    // $ANTLR start "rule__Modelet__Group__3__Impl"
    // InternalCogModParser.g:947:1: rule__Modelet__Group__3__Impl : ( Topic ) ;
    public final void rule__Modelet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:951:1: ( ( Topic ) )
            // InternalCogModParser.g:952:1: ( Topic )
            {
            // InternalCogModParser.g:952:1: ( Topic )
            // InternalCogModParser.g:953:2: Topic
            {
             before(grammarAccess.getModeletAccess().getTopicKeyword_3()); 
            match(input,Topic,FOLLOW_2); 
             after(grammarAccess.getModeletAccess().getTopicKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__3__Impl"


    // $ANTLR start "rule__Modelet__Group__4"
    // InternalCogModParser.g:962:1: rule__Modelet__Group__4 : rule__Modelet__Group__4__Impl rule__Modelet__Group__5 ;
    public final void rule__Modelet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:966:1: ( rule__Modelet__Group__4__Impl rule__Modelet__Group__5 )
            // InternalCogModParser.g:967:2: rule__Modelet__Group__4__Impl rule__Modelet__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Modelet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__4"


    // $ANTLR start "rule__Modelet__Group__4__Impl"
    // InternalCogModParser.g:974:1: rule__Modelet__Group__4__Impl : ( ( rule__Modelet__TopicAssignment_4 ) ) ;
    public final void rule__Modelet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:978:1: ( ( ( rule__Modelet__TopicAssignment_4 ) ) )
            // InternalCogModParser.g:979:1: ( ( rule__Modelet__TopicAssignment_4 ) )
            {
            // InternalCogModParser.g:979:1: ( ( rule__Modelet__TopicAssignment_4 ) )
            // InternalCogModParser.g:980:2: ( rule__Modelet__TopicAssignment_4 )
            {
             before(grammarAccess.getModeletAccess().getTopicAssignment_4()); 
            // InternalCogModParser.g:981:2: ( rule__Modelet__TopicAssignment_4 )
            // InternalCogModParser.g:981:3: rule__Modelet__TopicAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Modelet__TopicAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModeletAccess().getTopicAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__4__Impl"


    // $ANTLR start "rule__Modelet__Group__5"
    // InternalCogModParser.g:989:1: rule__Modelet__Group__5 : rule__Modelet__Group__5__Impl rule__Modelet__Group__6 ;
    public final void rule__Modelet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:993:1: ( rule__Modelet__Group__5__Impl rule__Modelet__Group__6 )
            // InternalCogModParser.g:994:2: rule__Modelet__Group__5__Impl rule__Modelet__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Modelet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__5"


    // $ANTLR start "rule__Modelet__Group__5__Impl"
    // InternalCogModParser.g:1001:1: rule__Modelet__Group__5__Impl : ( Type ) ;
    public final void rule__Modelet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1005:1: ( ( Type ) )
            // InternalCogModParser.g:1006:1: ( Type )
            {
            // InternalCogModParser.g:1006:1: ( Type )
            // InternalCogModParser.g:1007:2: Type
            {
             before(grammarAccess.getModeletAccess().getTypeKeyword_5()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getModeletAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__5__Impl"


    // $ANTLR start "rule__Modelet__Group__6"
    // InternalCogModParser.g:1016:1: rule__Modelet__Group__6 : rule__Modelet__Group__6__Impl rule__Modelet__Group__7 ;
    public final void rule__Modelet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1020:1: ( rule__Modelet__Group__6__Impl rule__Modelet__Group__7 )
            // InternalCogModParser.g:1021:2: rule__Modelet__Group__6__Impl rule__Modelet__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Modelet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modelet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__6"


    // $ANTLR start "rule__Modelet__Group__6__Impl"
    // InternalCogModParser.g:1028:1: rule__Modelet__Group__6__Impl : ( ( rule__Modelet__TypeAssignment_6 ) ) ;
    public final void rule__Modelet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1032:1: ( ( ( rule__Modelet__TypeAssignment_6 ) ) )
            // InternalCogModParser.g:1033:1: ( ( rule__Modelet__TypeAssignment_6 ) )
            {
            // InternalCogModParser.g:1033:1: ( ( rule__Modelet__TypeAssignment_6 ) )
            // InternalCogModParser.g:1034:2: ( rule__Modelet__TypeAssignment_6 )
            {
             before(grammarAccess.getModeletAccess().getTypeAssignment_6()); 
            // InternalCogModParser.g:1035:2: ( rule__Modelet__TypeAssignment_6 )
            // InternalCogModParser.g:1035:3: rule__Modelet__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Modelet__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModeletAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__6__Impl"


    // $ANTLR start "rule__Modelet__Group__7"
    // InternalCogModParser.g:1043:1: rule__Modelet__Group__7 : rule__Modelet__Group__7__Impl ;
    public final void rule__Modelet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1047:1: ( rule__Modelet__Group__7__Impl )
            // InternalCogModParser.g:1048:2: rule__Modelet__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modelet__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__7"


    // $ANTLR start "rule__Modelet__Group__7__Impl"
    // InternalCogModParser.g:1054:1: rule__Modelet__Group__7__Impl : ( RULE_END ) ;
    public final void rule__Modelet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1058:1: ( ( RULE_END ) )
            // InternalCogModParser.g:1059:1: ( RULE_END )
            {
            // InternalCogModParser.g:1059:1: ( RULE_END )
            // InternalCogModParser.g:1060:2: RULE_END
            {
             before(grammarAccess.getModeletAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getModeletAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__Group__7__Impl"


    // $ANTLR start "rule__Meta__Group__0"
    // InternalCogModParser.g:1070:1: rule__Meta__Group__0 : rule__Meta__Group__0__Impl rule__Meta__Group__1 ;
    public final void rule__Meta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1074:1: ( rule__Meta__Group__0__Impl rule__Meta__Group__1 )
            // InternalCogModParser.g:1075:2: rule__Meta__Group__0__Impl rule__Meta__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Meta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__0"


    // $ANTLR start "rule__Meta__Group__0__Impl"
    // InternalCogModParser.g:1082:1: rule__Meta__Group__0__Impl : ( () ) ;
    public final void rule__Meta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1086:1: ( ( () ) )
            // InternalCogModParser.g:1087:1: ( () )
            {
            // InternalCogModParser.g:1087:1: ( () )
            // InternalCogModParser.g:1088:2: ()
            {
             before(grammarAccess.getMetaAccess().getMetaAction_0()); 
            // InternalCogModParser.g:1089:2: ()
            // InternalCogModParser.g:1089:3: 
            {
            }

             after(grammarAccess.getMetaAccess().getMetaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__0__Impl"


    // $ANTLR start "rule__Meta__Group__1"
    // InternalCogModParser.g:1097:1: rule__Meta__Group__1 : rule__Meta__Group__1__Impl ;
    public final void rule__Meta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1101:1: ( rule__Meta__Group__1__Impl )
            // InternalCogModParser.g:1102:2: rule__Meta__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meta__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__1"


    // $ANTLR start "rule__Meta__Group__1__Impl"
    // InternalCogModParser.g:1108:1: rule__Meta__Group__1__Impl : ( ( rule__Meta__NameAssignment_1 ) ) ;
    public final void rule__Meta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1112:1: ( ( ( rule__Meta__NameAssignment_1 ) ) )
            // InternalCogModParser.g:1113:1: ( ( rule__Meta__NameAssignment_1 ) )
            {
            // InternalCogModParser.g:1113:1: ( ( rule__Meta__NameAssignment_1 ) )
            // InternalCogModParser.g:1114:2: ( rule__Meta__NameAssignment_1 )
            {
             before(grammarAccess.getMetaAccess().getNameAssignment_1()); 
            // InternalCogModParser.g:1115:2: ( rule__Meta__NameAssignment_1 )
            // InternalCogModParser.g:1115:3: rule__Meta__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Meta__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__Group__1__Impl"


    // $ANTLR start "rule__Coupling__Group__0"
    // InternalCogModParser.g:1124:1: rule__Coupling__Group__0 : rule__Coupling__Group__0__Impl rule__Coupling__Group__1 ;
    public final void rule__Coupling__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1128:1: ( rule__Coupling__Group__0__Impl rule__Coupling__Group__1 )
            // InternalCogModParser.g:1129:2: rule__Coupling__Group__0__Impl rule__Coupling__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Coupling__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coupling__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coupling__Group__0"


    // $ANTLR start "rule__Coupling__Group__0__Impl"
    // InternalCogModParser.g:1136:1: rule__Coupling__Group__0__Impl : ( () ) ;
    public final void rule__Coupling__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1140:1: ( ( () ) )
            // InternalCogModParser.g:1141:1: ( () )
            {
            // InternalCogModParser.g:1141:1: ( () )
            // InternalCogModParser.g:1142:2: ()
            {
             before(grammarAccess.getCouplingAccess().getCouplingAction_0()); 
            // InternalCogModParser.g:1143:2: ()
            // InternalCogModParser.g:1143:3: 
            {
            }

             after(grammarAccess.getCouplingAccess().getCouplingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coupling__Group__0__Impl"


    // $ANTLR start "rule__Coupling__Group__1"
    // InternalCogModParser.g:1151:1: rule__Coupling__Group__1 : rule__Coupling__Group__1__Impl ;
    public final void rule__Coupling__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1155:1: ( rule__Coupling__Group__1__Impl )
            // InternalCogModParser.g:1156:2: rule__Coupling__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coupling__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coupling__Group__1"


    // $ANTLR start "rule__Coupling__Group__1__Impl"
    // InternalCogModParser.g:1162:1: rule__Coupling__Group__1__Impl : ( ( rule__Coupling__NameAssignment_1 ) ) ;
    public final void rule__Coupling__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1166:1: ( ( ( rule__Coupling__NameAssignment_1 ) ) )
            // InternalCogModParser.g:1167:1: ( ( rule__Coupling__NameAssignment_1 ) )
            {
            // InternalCogModParser.g:1167:1: ( ( rule__Coupling__NameAssignment_1 ) )
            // InternalCogModParser.g:1168:2: ( rule__Coupling__NameAssignment_1 )
            {
             before(grammarAccess.getCouplingAccess().getNameAssignment_1()); 
            // InternalCogModParser.g:1169:2: ( rule__Coupling__NameAssignment_1 )
            // InternalCogModParser.g:1169:3: rule__Coupling__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coupling__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCouplingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coupling__Group__1__Impl"


    // $ANTLR start "rule__CognitiveModule__NameAssignment_1"
    // InternalCogModParser.g:1178:1: rule__CognitiveModule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CognitiveModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1182:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1183:2: ( ruleEString )
            {
            // InternalCogModParser.g:1183:2: ( ruleEString )
            // InternalCogModParser.g:1184:3: ruleEString
            {
             before(grammarAccess.getCognitiveModuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__NameAssignment_1"


    // $ANTLR start "rule__CognitiveModule__CoreAssignment_5"
    // InternalCogModParser.g:1193:1: rule__CognitiveModule__CoreAssignment_5 : ( ruleCore ) ;
    public final void rule__CognitiveModule__CoreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1197:1: ( ( ruleCore ) )
            // InternalCogModParser.g:1198:2: ( ruleCore )
            {
            // InternalCogModParser.g:1198:2: ( ruleCore )
            // InternalCogModParser.g:1199:3: ruleCore
            {
             before(grammarAccess.getCognitiveModuleAccess().getCoreCoreParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCore();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getCoreCoreParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__CoreAssignment_5"


    // $ANTLR start "rule__CognitiveModule__EfferentAssignment_6_2"
    // InternalCogModParser.g:1208:1: rule__CognitiveModule__EfferentAssignment_6_2 : ( ruleModelet ) ;
    public final void rule__CognitiveModule__EfferentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1212:1: ( ( ruleModelet ) )
            // InternalCogModParser.g:1213:2: ( ruleModelet )
            {
            // InternalCogModParser.g:1213:2: ( ruleModelet )
            // InternalCogModParser.g:1214:3: ruleModelet
            {
             before(grammarAccess.getCognitiveModuleAccess().getEfferentModeletParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelet();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getEfferentModeletParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__EfferentAssignment_6_2"


    // $ANTLR start "rule__CognitiveModule__AfferentAssignment_7_2"
    // InternalCogModParser.g:1223:1: rule__CognitiveModule__AfferentAssignment_7_2 : ( ruleModelet ) ;
    public final void rule__CognitiveModule__AfferentAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1227:1: ( ( ruleModelet ) )
            // InternalCogModParser.g:1228:2: ( ruleModelet )
            {
            // InternalCogModParser.g:1228:2: ( ruleModelet )
            // InternalCogModParser.g:1229:3: ruleModelet
            {
             before(grammarAccess.getCognitiveModuleAccess().getAfferentModeletParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelet();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getAfferentModeletParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__AfferentAssignment_7_2"


    // $ANTLR start "rule__CognitiveModule__MetaAssignment_9"
    // InternalCogModParser.g:1238:1: rule__CognitiveModule__MetaAssignment_9 : ( ruleMeta ) ;
    public final void rule__CognitiveModule__MetaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1242:1: ( ( ruleMeta ) )
            // InternalCogModParser.g:1243:2: ( ruleMeta )
            {
            // InternalCogModParser.g:1243:2: ( ruleMeta )
            // InternalCogModParser.g:1244:3: ruleMeta
            {
             before(grammarAccess.getCognitiveModuleAccess().getMetaMetaParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleMeta();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getMetaMetaParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__MetaAssignment_9"


    // $ANTLR start "rule__CognitiveModule__CouplingAssignment_11"
    // InternalCogModParser.g:1253:1: rule__CognitiveModule__CouplingAssignment_11 : ( ruleCoupling ) ;
    public final void rule__CognitiveModule__CouplingAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1257:1: ( ( ruleCoupling ) )
            // InternalCogModParser.g:1258:2: ( ruleCoupling )
            {
            // InternalCogModParser.g:1258:2: ( ruleCoupling )
            // InternalCogModParser.g:1259:3: ruleCoupling
            {
             before(grammarAccess.getCognitiveModuleAccess().getCouplingCouplingParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleCoupling();

            state._fsp--;

             after(grammarAccess.getCognitiveModuleAccess().getCouplingCouplingParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CognitiveModule__CouplingAssignment_11"


    // $ANTLR start "rule__Core__NameAssignment_1"
    // InternalCogModParser.g:1268:1: rule__Core__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Core__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1272:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1273:2: ( ruleEString )
            {
            // InternalCogModParser.g:1273:2: ( ruleEString )
            // InternalCogModParser.g:1274:3: ruleEString
            {
             before(grammarAccess.getCoreAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoreAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Core__NameAssignment_1"


    // $ANTLR start "rule__Modelet__NameAssignment_0"
    // InternalCogModParser.g:1283:1: rule__Modelet__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Modelet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1287:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1288:2: ( ruleEString )
            {
            // InternalCogModParser.g:1288:2: ( ruleEString )
            // InternalCogModParser.g:1289:3: ruleEString
            {
             before(grammarAccess.getModeletAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModeletAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__NameAssignment_0"


    // $ANTLR start "rule__Modelet__TopicAssignment_4"
    // InternalCogModParser.g:1298:1: rule__Modelet__TopicAssignment_4 : ( ruleEString ) ;
    public final void rule__Modelet__TopicAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1302:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1303:2: ( ruleEString )
            {
            // InternalCogModParser.g:1303:2: ( ruleEString )
            // InternalCogModParser.g:1304:3: ruleEString
            {
             before(grammarAccess.getModeletAccess().getTopicEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModeletAccess().getTopicEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__TopicAssignment_4"


    // $ANTLR start "rule__Modelet__TypeAssignment_6"
    // InternalCogModParser.g:1313:1: rule__Modelet__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__Modelet__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1317:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1318:2: ( ruleEString )
            {
            // InternalCogModParser.g:1318:2: ( ruleEString )
            // InternalCogModParser.g:1319:3: ruleEString
            {
             before(grammarAccess.getModeletAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModeletAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modelet__TypeAssignment_6"


    // $ANTLR start "rule__Meta__NameAssignment_1"
    // InternalCogModParser.g:1328:1: rule__Meta__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Meta__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1332:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1333:2: ( ruleEString )
            {
            // InternalCogModParser.g:1333:2: ( ruleEString )
            // InternalCogModParser.g:1334:3: ruleEString
            {
             before(grammarAccess.getMetaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meta__NameAssignment_1"


    // $ANTLR start "rule__Coupling__NameAssignment_1"
    // InternalCogModParser.g:1343:1: rule__Coupling__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Coupling__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCogModParser.g:1347:1: ( ( ruleEString ) )
            // InternalCogModParser.g:1348:2: ( ruleEString )
            {
            // InternalCogModParser.g:1348:2: ( ruleEString )
            // InternalCogModParser.g:1349:3: ruleEString
            {
             before(grammarAccess.getCouplingAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCouplingAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Coupling__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000250L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});

}