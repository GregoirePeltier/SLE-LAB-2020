package unice.epu.carpilot.xtext.ide.contentassist.antlr.internal;

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
import unice.epu.carpilot.xtext.services.CarpilotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCarpilotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'>'", "'<'", "'>='", "'<='", "'red'", "'blue'", "'orange'", "'black'", "'white'", "'building'", "'very right'", "'very left'", "'left'", "'right'", "'center'", "'forward'", "'backward'", "'stop'", "'distance left'", "'distance right'", "'front'", "'orders:'", "'\\n'", "'named'", "'rules:\\n'", "'->'", "'until'", "'can'", "'go'", "'.'", "'not'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCarpilotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCarpilotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCarpilotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCarpilot.g"; }


    	private CarpilotGrammarAccess grammarAccess;

    	public void setGrammarAccess(CarpilotGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCar"
    // InternalCarpilot.g:53:1: entryRuleCar : ruleCar EOF ;
    public final void entryRuleCar() throws RecognitionException {
        try {
            // InternalCarpilot.g:54:1: ( ruleCar EOF )
            // InternalCarpilot.g:55:1: ruleCar EOF
            {
             before(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_1);
            ruleCar();

            state._fsp--;

             after(grammarAccess.getCarRule()); 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalCarpilot.g:62:1: ruleCar : ( ( rule__Car__Group__0 ) ) ;
    public final void ruleCar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:66:2: ( ( ( rule__Car__Group__0 ) ) )
            // InternalCarpilot.g:67:2: ( ( rule__Car__Group__0 ) )
            {
            // InternalCarpilot.g:67:2: ( ( rule__Car__Group__0 ) )
            // InternalCarpilot.g:68:3: ( rule__Car__Group__0 )
            {
             before(grammarAccess.getCarAccess().getGroup()); 
            // InternalCarpilot.g:69:3: ( rule__Car__Group__0 )
            // InternalCarpilot.g:69:4: rule__Car__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getGroup()); 

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleCondition"
    // InternalCarpilot.g:78:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCarpilot.g:79:1: ( ruleCondition EOF )
            // InternalCarpilot.g:80:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCarpilot.g:87:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:91:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalCarpilot.g:92:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalCarpilot.g:92:2: ( ( rule__Condition__Alternatives ) )
            // InternalCarpilot.g:93:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalCarpilot.g:94:3: ( rule__Condition__Alternatives )
            // InternalCarpilot.g:94:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEString"
    // InternalCarpilot.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCarpilot.g:104:1: ( ruleEString EOF )
            // InternalCarpilot.g:105:1: ruleEString EOF
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
    // InternalCarpilot.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCarpilot.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCarpilot.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalCarpilot.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCarpilot.g:119:3: ( rule__EString__Alternatives )
            // InternalCarpilot.g:119:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleRule"
    // InternalCarpilot.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalCarpilot.g:129:1: ( ruleRule EOF )
            // InternalCarpilot.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCarpilot.g:137:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:141:2: ( ( ( rule__Rule__Alternatives ) ) )
            // InternalCarpilot.g:142:2: ( ( rule__Rule__Alternatives ) )
            {
            // InternalCarpilot.g:142:2: ( ( rule__Rule__Alternatives ) )
            // InternalCarpilot.g:143:3: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // InternalCarpilot.g:144:3: ( rule__Rule__Alternatives )
            // InternalCarpilot.g:144:4: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDirectRule"
    // InternalCarpilot.g:153:1: entryRuleDirectRule : ruleDirectRule EOF ;
    public final void entryRuleDirectRule() throws RecognitionException {
        try {
            // InternalCarpilot.g:154:1: ( ruleDirectRule EOF )
            // InternalCarpilot.g:155:1: ruleDirectRule EOF
            {
             before(grammarAccess.getDirectRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectRule();

            state._fsp--;

             after(grammarAccess.getDirectRuleRule()); 
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
    // $ANTLR end "entryRuleDirectRule"


    // $ANTLR start "ruleDirectRule"
    // InternalCarpilot.g:162:1: ruleDirectRule : ( ( rule__DirectRule__Group__0 ) ) ;
    public final void ruleDirectRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:166:2: ( ( ( rule__DirectRule__Group__0 ) ) )
            // InternalCarpilot.g:167:2: ( ( rule__DirectRule__Group__0 ) )
            {
            // InternalCarpilot.g:167:2: ( ( rule__DirectRule__Group__0 ) )
            // InternalCarpilot.g:168:3: ( rule__DirectRule__Group__0 )
            {
             before(grammarAccess.getDirectRuleAccess().getGroup()); 
            // InternalCarpilot.g:169:3: ( rule__DirectRule__Group__0 )
            // InternalCarpilot.g:169:4: rule__DirectRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirectRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleDirectRule"


    // $ANTLR start "entryRulePersistingRule"
    // InternalCarpilot.g:178:1: entryRulePersistingRule : rulePersistingRule EOF ;
    public final void entryRulePersistingRule() throws RecognitionException {
        try {
            // InternalCarpilot.g:179:1: ( rulePersistingRule EOF )
            // InternalCarpilot.g:180:1: rulePersistingRule EOF
            {
             before(grammarAccess.getPersistingRuleRule()); 
            pushFollow(FOLLOW_1);
            rulePersistingRule();

            state._fsp--;

             after(grammarAccess.getPersistingRuleRule()); 
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
    // $ANTLR end "entryRulePersistingRule"


    // $ANTLR start "rulePersistingRule"
    // InternalCarpilot.g:187:1: rulePersistingRule : ( ( rule__PersistingRule__Group__0 ) ) ;
    public final void rulePersistingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:191:2: ( ( ( rule__PersistingRule__Group__0 ) ) )
            // InternalCarpilot.g:192:2: ( ( rule__PersistingRule__Group__0 ) )
            {
            // InternalCarpilot.g:192:2: ( ( rule__PersistingRule__Group__0 ) )
            // InternalCarpilot.g:193:3: ( rule__PersistingRule__Group__0 )
            {
             before(grammarAccess.getPersistingRuleAccess().getGroup()); 
            // InternalCarpilot.g:194:3: ( rule__PersistingRule__Group__0 )
            // InternalCarpilot.g:194:4: rule__PersistingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersistingRuleAccess().getGroup()); 

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
    // $ANTLR end "rulePersistingRule"


    // $ANTLR start "entryRuleRuleEffect"
    // InternalCarpilot.g:203:1: entryRuleRuleEffect : ruleRuleEffect EOF ;
    public final void entryRuleRuleEffect() throws RecognitionException {
        try {
            // InternalCarpilot.g:204:1: ( ruleRuleEffect EOF )
            // InternalCarpilot.g:205:1: ruleRuleEffect EOF
            {
             before(grammarAccess.getRuleEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleEffect();

            state._fsp--;

             after(grammarAccess.getRuleEffectRule()); 
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
    // $ANTLR end "entryRuleRuleEffect"


    // $ANTLR start "ruleRuleEffect"
    // InternalCarpilot.g:212:1: ruleRuleEffect : ( ( rule__RuleEffect__Alternatives ) ) ;
    public final void ruleRuleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:216:2: ( ( ( rule__RuleEffect__Alternatives ) ) )
            // InternalCarpilot.g:217:2: ( ( rule__RuleEffect__Alternatives ) )
            {
            // InternalCarpilot.g:217:2: ( ( rule__RuleEffect__Alternatives ) )
            // InternalCarpilot.g:218:3: ( rule__RuleEffect__Alternatives )
            {
             before(grammarAccess.getRuleEffectAccess().getAlternatives()); 
            // InternalCarpilot.g:219:3: ( rule__RuleEffect__Alternatives )
            // InternalCarpilot.g:219:4: rule__RuleEffect__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleEffect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleEffectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRuleEffect"


    // $ANTLR start "entryRuleCommandEffect"
    // InternalCarpilot.g:228:1: entryRuleCommandEffect : ruleCommandEffect EOF ;
    public final void entryRuleCommandEffect() throws RecognitionException {
        try {
            // InternalCarpilot.g:229:1: ( ruleCommandEffect EOF )
            // InternalCarpilot.g:230:1: ruleCommandEffect EOF
            {
             before(grammarAccess.getCommandEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandEffect();

            state._fsp--;

             after(grammarAccess.getCommandEffectRule()); 
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
    // $ANTLR end "entryRuleCommandEffect"


    // $ANTLR start "ruleCommandEffect"
    // InternalCarpilot.g:237:1: ruleCommandEffect : ( ( rule__CommandEffect__CommandAssignment ) ) ;
    public final void ruleCommandEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:241:2: ( ( ( rule__CommandEffect__CommandAssignment ) ) )
            // InternalCarpilot.g:242:2: ( ( rule__CommandEffect__CommandAssignment ) )
            {
            // InternalCarpilot.g:242:2: ( ( rule__CommandEffect__CommandAssignment ) )
            // InternalCarpilot.g:243:3: ( rule__CommandEffect__CommandAssignment )
            {
             before(grammarAccess.getCommandEffectAccess().getCommandAssignment()); 
            // InternalCarpilot.g:244:3: ( rule__CommandEffect__CommandAssignment )
            // InternalCarpilot.g:244:4: rule__CommandEffect__CommandAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CommandEffect__CommandAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommandEffectAccess().getCommandAssignment()); 

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
    // $ANTLR end "ruleCommandEffect"


    // $ANTLR start "entryRuleAbilityEffect"
    // InternalCarpilot.g:253:1: entryRuleAbilityEffect : ruleAbilityEffect EOF ;
    public final void entryRuleAbilityEffect() throws RecognitionException {
        try {
            // InternalCarpilot.g:254:1: ( ruleAbilityEffect EOF )
            // InternalCarpilot.g:255:1: ruleAbilityEffect EOF
            {
             before(grammarAccess.getAbilityEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleAbilityEffect();

            state._fsp--;

             after(grammarAccess.getAbilityEffectRule()); 
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
    // $ANTLR end "entryRuleAbilityEffect"


    // $ANTLR start "ruleAbilityEffect"
    // InternalCarpilot.g:262:1: ruleAbilityEffect : ( ( rule__AbilityEffect__Group__0 ) ) ;
    public final void ruleAbilityEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:266:2: ( ( ( rule__AbilityEffect__Group__0 ) ) )
            // InternalCarpilot.g:267:2: ( ( rule__AbilityEffect__Group__0 ) )
            {
            // InternalCarpilot.g:267:2: ( ( rule__AbilityEffect__Group__0 ) )
            // InternalCarpilot.g:268:3: ( rule__AbilityEffect__Group__0 )
            {
             before(grammarAccess.getAbilityEffectAccess().getGroup()); 
            // InternalCarpilot.g:269:3: ( rule__AbilityEffect__Group__0 )
            // InternalCarpilot.g:269:4: rule__AbilityEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbilityEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbilityEffectAccess().getGroup()); 

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
    // $ANTLR end "ruleAbilityEffect"


    // $ANTLR start "entryRuleCommand"
    // InternalCarpilot.g:278:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalCarpilot.g:279:1: ( ruleCommand EOF )
            // InternalCarpilot.g:280:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalCarpilot.g:287:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:291:2: ( ( ( rule__Command__Group__0 ) ) )
            // InternalCarpilot.g:292:2: ( ( rule__Command__Group__0 ) )
            {
            // InternalCarpilot.g:292:2: ( ( rule__Command__Group__0 ) )
            // InternalCarpilot.g:293:3: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // InternalCarpilot.g:294:3: ( rule__Command__Group__0 )
            // InternalCarpilot.g:294:4: rule__Command__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleColorCondition"
    // InternalCarpilot.g:303:1: entryRuleColorCondition : ruleColorCondition EOF ;
    public final void entryRuleColorCondition() throws RecognitionException {
        try {
            // InternalCarpilot.g:304:1: ( ruleColorCondition EOF )
            // InternalCarpilot.g:305:1: ruleColorCondition EOF
            {
             before(grammarAccess.getColorConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleColorCondition();

            state._fsp--;

             after(grammarAccess.getColorConditionRule()); 
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
    // $ANTLR end "entryRuleColorCondition"


    // $ANTLR start "ruleColorCondition"
    // InternalCarpilot.g:312:1: ruleColorCondition : ( ( rule__ColorCondition__Alternatives ) ) ;
    public final void ruleColorCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:316:2: ( ( ( rule__ColorCondition__Alternatives ) ) )
            // InternalCarpilot.g:317:2: ( ( rule__ColorCondition__Alternatives ) )
            {
            // InternalCarpilot.g:317:2: ( ( rule__ColorCondition__Alternatives ) )
            // InternalCarpilot.g:318:3: ( rule__ColorCondition__Alternatives )
            {
             before(grammarAccess.getColorConditionAccess().getAlternatives()); 
            // InternalCarpilot.g:319:3: ( rule__ColorCondition__Alternatives )
            // InternalCarpilot.g:319:4: rule__ColorCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColorCondition"


    // $ANTLR start "entryRuleDistanceCondition"
    // InternalCarpilot.g:328:1: entryRuleDistanceCondition : ruleDistanceCondition EOF ;
    public final void entryRuleDistanceCondition() throws RecognitionException {
        try {
            // InternalCarpilot.g:329:1: ( ruleDistanceCondition EOF )
            // InternalCarpilot.g:330:1: ruleDistanceCondition EOF
            {
             before(grammarAccess.getDistanceConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceCondition();

            state._fsp--;

             after(grammarAccess.getDistanceConditionRule()); 
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
    // $ANTLR end "entryRuleDistanceCondition"


    // $ANTLR start "ruleDistanceCondition"
    // InternalCarpilot.g:337:1: ruleDistanceCondition : ( ( rule__DistanceCondition__Group__0 ) ) ;
    public final void ruleDistanceCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:341:2: ( ( ( rule__DistanceCondition__Group__0 ) ) )
            // InternalCarpilot.g:342:2: ( ( rule__DistanceCondition__Group__0 ) )
            {
            // InternalCarpilot.g:342:2: ( ( rule__DistanceCondition__Group__0 ) )
            // InternalCarpilot.g:343:3: ( rule__DistanceCondition__Group__0 )
            {
             before(grammarAccess.getDistanceConditionAccess().getGroup()); 
            // InternalCarpilot.g:344:3: ( rule__DistanceCondition__Group__0 )
            // InternalCarpilot.g:344:4: rule__DistanceCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleDistanceCondition"


    // $ANTLR start "entryRuleFloat"
    // InternalCarpilot.g:353:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalCarpilot.g:354:1: ( ruleFloat EOF )
            // InternalCarpilot.g:355:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalCarpilot.g:362:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:366:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalCarpilot.g:367:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalCarpilot.g:367:2: ( ( rule__Float__Group__0 ) )
            // InternalCarpilot.g:368:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalCarpilot.g:369:3: ( rule__Float__Group__0 )
            // InternalCarpilot.g:369:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "ruleAnalogOperand"
    // InternalCarpilot.g:378:1: ruleAnalogOperand : ( ( rule__AnalogOperand__Alternatives ) ) ;
    public final void ruleAnalogOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:382:1: ( ( ( rule__AnalogOperand__Alternatives ) ) )
            // InternalCarpilot.g:383:2: ( ( rule__AnalogOperand__Alternatives ) )
            {
            // InternalCarpilot.g:383:2: ( ( rule__AnalogOperand__Alternatives ) )
            // InternalCarpilot.g:384:3: ( rule__AnalogOperand__Alternatives )
            {
             before(grammarAccess.getAnalogOperandAccess().getAlternatives()); 
            // InternalCarpilot.g:385:3: ( rule__AnalogOperand__Alternatives )
            // InternalCarpilot.g:385:4: rule__AnalogOperand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AnalogOperand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnalogOperandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnalogOperand"


    // $ANTLR start "ruleColor"
    // InternalCarpilot.g:394:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:398:1: ( ( ( rule__Color__Alternatives ) ) )
            // InternalCarpilot.g:399:2: ( ( rule__Color__Alternatives ) )
            {
            // InternalCarpilot.g:399:2: ( ( rule__Color__Alternatives ) )
            // InternalCarpilot.g:400:3: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // InternalCarpilot.g:401:3: ( rule__Color__Alternatives )
            // InternalCarpilot.g:401:4: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleCamera"
    // InternalCarpilot.g:410:1: ruleCamera : ( ( rule__Camera__Alternatives ) ) ;
    public final void ruleCamera() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:414:1: ( ( ( rule__Camera__Alternatives ) ) )
            // InternalCarpilot.g:415:2: ( ( rule__Camera__Alternatives ) )
            {
            // InternalCarpilot.g:415:2: ( ( rule__Camera__Alternatives ) )
            // InternalCarpilot.g:416:3: ( rule__Camera__Alternatives )
            {
             before(grammarAccess.getCameraAccess().getAlternatives()); 
            // InternalCarpilot.g:417:3: ( rule__Camera__Alternatives )
            // InternalCarpilot.g:417:4: rule__Camera__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Camera__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCameraAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCamera"


    // $ANTLR start "ruleDirection"
    // InternalCarpilot.g:426:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:430:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalCarpilot.g:431:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalCarpilot.g:431:2: ( ( rule__Direction__Alternatives ) )
            // InternalCarpilot.g:432:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalCarpilot.g:433:3: ( rule__Direction__Alternatives )
            // InternalCarpilot.g:433:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleSensor"
    // InternalCarpilot.g:442:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:446:1: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalCarpilot.g:447:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalCarpilot.g:447:2: ( ( rule__Sensor__Alternatives ) )
            // InternalCarpilot.g:448:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalCarpilot.g:449:3: ( rule__Sensor__Alternatives )
            // InternalCarpilot.g:449:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalCarpilot.g:457:1: rule__Condition__Alternatives : ( ( ruleColorCondition ) | ( ruleDistanceCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:461:1: ( ( ruleColorCondition ) | ( ruleDistanceCondition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=16 && LA1_0<=26)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=30 && LA1_0<=32)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCarpilot.g:462:2: ( ruleColorCondition )
                    {
                    // InternalCarpilot.g:462:2: ( ruleColorCondition )
                    // InternalCarpilot.g:463:3: ruleColorCondition
                    {
                     before(grammarAccess.getConditionAccess().getColorConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColorCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getColorConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:468:2: ( ruleDistanceCondition )
                    {
                    // InternalCarpilot.g:468:2: ( ruleDistanceCondition )
                    // InternalCarpilot.g:469:3: ruleDistanceCondition
                    {
                     before(grammarAccess.getConditionAccess().getDistanceConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getDistanceConditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCarpilot.g:478:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:482:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCarpilot.g:483:2: ( RULE_STRING )
                    {
                    // InternalCarpilot.g:483:2: ( RULE_STRING )
                    // InternalCarpilot.g:484:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:489:2: ( RULE_ID )
                    {
                    // InternalCarpilot.g:489:2: ( RULE_ID )
                    // InternalCarpilot.g:490:3: RULE_ID
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


    // $ANTLR start "rule__Rule__Alternatives"
    // InternalCarpilot.g:499:1: rule__Rule__Alternatives : ( ( rulePersistingRule ) | ( ruleDirectRule ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:503:1: ( ( rulePersistingRule ) | ( ruleDirectRule ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCarpilot.g:504:2: ( rulePersistingRule )
                    {
                    // InternalCarpilot.g:504:2: ( rulePersistingRule )
                    // InternalCarpilot.g:505:3: rulePersistingRule
                    {
                     before(grammarAccess.getRuleAccess().getPersistingRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePersistingRule();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getPersistingRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:510:2: ( ruleDirectRule )
                    {
                    // InternalCarpilot.g:510:2: ( ruleDirectRule )
                    // InternalCarpilot.g:511:3: ruleDirectRule
                    {
                     before(grammarAccess.getRuleAccess().getDirectRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDirectRule();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getDirectRuleParserRuleCall_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__RuleEffect__Alternatives"
    // InternalCarpilot.g:520:1: rule__RuleEffect__Alternatives : ( ( ruleCommandEffect ) | ( ruleAbilityEffect ) );
    public final void rule__RuleEffect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:524:1: ( ( ruleCommandEffect ) | ( ruleAbilityEffect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||(LA4_0>=24 && LA4_0<=25)||(LA4_0>=27 && LA4_0<=29)||(LA4_0>=33 && LA4_0<=34)||LA4_0==38||LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCarpilot.g:525:2: ( ruleCommandEffect )
                    {
                    // InternalCarpilot.g:525:2: ( ruleCommandEffect )
                    // InternalCarpilot.g:526:3: ruleCommandEffect
                    {
                     before(grammarAccess.getRuleEffectAccess().getCommandEffectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandEffect();

                    state._fsp--;

                     after(grammarAccess.getRuleEffectAccess().getCommandEffectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:531:2: ( ruleAbilityEffect )
                    {
                    // InternalCarpilot.g:531:2: ( ruleAbilityEffect )
                    // InternalCarpilot.g:532:3: ruleAbilityEffect
                    {
                     before(grammarAccess.getRuleEffectAccess().getAbilityEffectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbilityEffect();

                    state._fsp--;

                     after(grammarAccess.getRuleEffectAccess().getAbilityEffectParserRuleCall_1()); 

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
    // $ANTLR end "rule__RuleEffect__Alternatives"


    // $ANTLR start "rule__ColorCondition__Alternatives"
    // InternalCarpilot.g:541:1: rule__ColorCondition__Alternatives : ( ( ( rule__ColorCondition__Group_0__0 ) ) | ( ( rule__ColorCondition__Group_1__0 ) ) );
    public final void rule__ColorCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:545:1: ( ( ( rule__ColorCondition__Group_0__0 ) ) | ( ( rule__ColorCondition__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=21)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=22 && LA5_0<=26)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCarpilot.g:546:2: ( ( rule__ColorCondition__Group_0__0 ) )
                    {
                    // InternalCarpilot.g:546:2: ( ( rule__ColorCondition__Group_0__0 ) )
                    // InternalCarpilot.g:547:3: ( rule__ColorCondition__Group_0__0 )
                    {
                     before(grammarAccess.getColorConditionAccess().getGroup_0()); 
                    // InternalCarpilot.g:548:3: ( rule__ColorCondition__Group_0__0 )
                    // InternalCarpilot.g:548:4: rule__ColorCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorCondition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:552:2: ( ( rule__ColorCondition__Group_1__0 ) )
                    {
                    // InternalCarpilot.g:552:2: ( ( rule__ColorCondition__Group_1__0 ) )
                    // InternalCarpilot.g:553:3: ( rule__ColorCondition__Group_1__0 )
                    {
                     before(grammarAccess.getColorConditionAccess().getGroup_1()); 
                    // InternalCarpilot.g:554:3: ( rule__ColorCondition__Group_1__0 )
                    // InternalCarpilot.g:554:4: rule__ColorCondition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorCondition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ColorCondition__Alternatives"


    // $ANTLR start "rule__AnalogOperand__Alternatives"
    // InternalCarpilot.g:562:1: rule__AnalogOperand__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__AnalogOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:566:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCarpilot.g:567:2: ( ( '==' ) )
                    {
                    // InternalCarpilot.g:567:2: ( ( '==' ) )
                    // InternalCarpilot.g:568:3: ( '==' )
                    {
                     before(grammarAccess.getAnalogOperandAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // InternalCarpilot.g:569:3: ( '==' )
                    // InternalCarpilot.g:569:4: '=='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAnalogOperandAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:573:2: ( ( '>' ) )
                    {
                    // InternalCarpilot.g:573:2: ( ( '>' ) )
                    // InternalCarpilot.g:574:3: ( '>' )
                    {
                     before(grammarAccess.getAnalogOperandAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // InternalCarpilot.g:575:3: ( '>' )
                    // InternalCarpilot.g:575:4: '>'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAnalogOperandAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:579:2: ( ( '<' ) )
                    {
                    // InternalCarpilot.g:579:2: ( ( '<' ) )
                    // InternalCarpilot.g:580:3: ( '<' )
                    {
                     before(grammarAccess.getAnalogOperandAccess().getLowerEnumLiteralDeclaration_2()); 
                    // InternalCarpilot.g:581:3: ( '<' )
                    // InternalCarpilot.g:581:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAnalogOperandAccess().getLowerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:585:2: ( ( '>=' ) )
                    {
                    // InternalCarpilot.g:585:2: ( ( '>=' ) )
                    // InternalCarpilot.g:586:3: ( '>=' )
                    {
                     before(grammarAccess.getAnalogOperandAccess().getGreaterEqualsEnumLiteralDeclaration_3()); 
                    // InternalCarpilot.g:587:3: ( '>=' )
                    // InternalCarpilot.g:587:4: '>='
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAnalogOperandAccess().getGreaterEqualsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:591:2: ( ( '<=' ) )
                    {
                    // InternalCarpilot.g:591:2: ( ( '<=' ) )
                    // InternalCarpilot.g:592:3: ( '<=' )
                    {
                     before(grammarAccess.getAnalogOperandAccess().getLowerEqualsEnumLiteralDeclaration_4()); 
                    // InternalCarpilot.g:593:3: ( '<=' )
                    // InternalCarpilot.g:593:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getAnalogOperandAccess().getLowerEqualsEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__AnalogOperand__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // InternalCarpilot.g:601:1: rule__Color__Alternatives : ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'orange' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'building' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:605:1: ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'orange' ) ) | ( ( 'black' ) ) | ( ( 'white' ) ) | ( ( 'building' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCarpilot.g:606:2: ( ( 'red' ) )
                    {
                    // InternalCarpilot.g:606:2: ( ( 'red' ) )
                    // InternalCarpilot.g:607:3: ( 'red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalCarpilot.g:608:3: ( 'red' )
                    // InternalCarpilot.g:608:4: 'red'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:612:2: ( ( 'blue' ) )
                    {
                    // InternalCarpilot.g:612:2: ( ( 'blue' ) )
                    // InternalCarpilot.g:613:3: ( 'blue' )
                    {
                     before(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalCarpilot.g:614:3: ( 'blue' )
                    // InternalCarpilot.g:614:4: 'blue'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:618:2: ( ( 'orange' ) )
                    {
                    // InternalCarpilot.g:618:2: ( ( 'orange' ) )
                    // InternalCarpilot.g:619:3: ( 'orange' )
                    {
                     before(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_2()); 
                    // InternalCarpilot.g:620:3: ( 'orange' )
                    // InternalCarpilot.g:620:4: 'orange'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:624:2: ( ( 'black' ) )
                    {
                    // InternalCarpilot.g:624:2: ( ( 'black' ) )
                    // InternalCarpilot.g:625:3: ( 'black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3()); 
                    // InternalCarpilot.g:626:3: ( 'black' )
                    // InternalCarpilot.g:626:4: 'black'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:630:2: ( ( 'white' ) )
                    {
                    // InternalCarpilot.g:630:2: ( ( 'white' ) )
                    // InternalCarpilot.g:631:3: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_4()); 
                    // InternalCarpilot.g:632:3: ( 'white' )
                    // InternalCarpilot.g:632:4: 'white'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCarpilot.g:636:2: ( ( 'building' ) )
                    {
                    // InternalCarpilot.g:636:2: ( ( 'building' ) )
                    // InternalCarpilot.g:637:3: ( 'building' )
                    {
                     before(grammarAccess.getColorAccess().getBuildingEnumLiteralDeclaration_5()); 
                    // InternalCarpilot.g:638:3: ( 'building' )
                    // InternalCarpilot.g:638:4: 'building'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorAccess().getBuildingEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Camera__Alternatives"
    // InternalCarpilot.g:646:1: rule__Camera__Alternatives : ( ( ( 'very right' ) ) | ( ( 'very left' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'center' ) ) );
    public final void rule__Camera__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:650:1: ( ( ( 'very right' ) ) | ( ( 'very left' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'center' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCarpilot.g:651:2: ( ( 'very right' ) )
                    {
                    // InternalCarpilot.g:651:2: ( ( 'very right' ) )
                    // InternalCarpilot.g:652:3: ( 'very right' )
                    {
                     before(grammarAccess.getCameraAccess().getVery_rightEnumLiteralDeclaration_0()); 
                    // InternalCarpilot.g:653:3: ( 'very right' )
                    // InternalCarpilot.g:653:4: 'very right'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getCameraAccess().getVery_rightEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:657:2: ( ( 'very left' ) )
                    {
                    // InternalCarpilot.g:657:2: ( ( 'very left' ) )
                    // InternalCarpilot.g:658:3: ( 'very left' )
                    {
                     before(grammarAccess.getCameraAccess().getVery_leftEnumLiteralDeclaration_1()); 
                    // InternalCarpilot.g:659:3: ( 'very left' )
                    // InternalCarpilot.g:659:4: 'very left'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCameraAccess().getVery_leftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:663:2: ( ( 'left' ) )
                    {
                    // InternalCarpilot.g:663:2: ( ( 'left' ) )
                    // InternalCarpilot.g:664:3: ( 'left' )
                    {
                     before(grammarAccess.getCameraAccess().getLeftEnumLiteralDeclaration_2()); 
                    // InternalCarpilot.g:665:3: ( 'left' )
                    // InternalCarpilot.g:665:4: 'left'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getCameraAccess().getLeftEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:669:2: ( ( 'right' ) )
                    {
                    // InternalCarpilot.g:669:2: ( ( 'right' ) )
                    // InternalCarpilot.g:670:3: ( 'right' )
                    {
                     before(grammarAccess.getCameraAccess().getRightEnumLiteralDeclaration_3()); 
                    // InternalCarpilot.g:671:3: ( 'right' )
                    // InternalCarpilot.g:671:4: 'right'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getCameraAccess().getRightEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:675:2: ( ( 'center' ) )
                    {
                    // InternalCarpilot.g:675:2: ( ( 'center' ) )
                    // InternalCarpilot.g:676:3: ( 'center' )
                    {
                     before(grammarAccess.getCameraAccess().getCenterEnumLiteralDeclaration_4()); 
                    // InternalCarpilot.g:677:3: ( 'center' )
                    // InternalCarpilot.g:677:4: 'center'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getCameraAccess().getCenterEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Camera__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalCarpilot.g:685:1: rule__Direction__Alternatives : ( ( ( 'forward' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:689:1: ( ( ( 'forward' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'backward' ) ) | ( ( 'stop' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCarpilot.g:690:2: ( ( 'forward' ) )
                    {
                    // InternalCarpilot.g:690:2: ( ( 'forward' ) )
                    // InternalCarpilot.g:691:3: ( 'forward' )
                    {
                     before(grammarAccess.getDirectionAccess().getForwardEnumLiteralDeclaration_0()); 
                    // InternalCarpilot.g:692:3: ( 'forward' )
                    // InternalCarpilot.g:692:4: 'forward'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getForwardEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:696:2: ( ( 'left' ) )
                    {
                    // InternalCarpilot.g:696:2: ( ( 'left' ) )
                    // InternalCarpilot.g:697:3: ( 'left' )
                    {
                     before(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalCarpilot.g:698:3: ( 'left' )
                    // InternalCarpilot.g:698:4: 'left'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:702:2: ( ( 'right' ) )
                    {
                    // InternalCarpilot.g:702:2: ( ( 'right' ) )
                    // InternalCarpilot.g:703:3: ( 'right' )
                    {
                     before(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalCarpilot.g:704:3: ( 'right' )
                    // InternalCarpilot.g:704:4: 'right'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:708:2: ( ( 'backward' ) )
                    {
                    // InternalCarpilot.g:708:2: ( ( 'backward' ) )
                    // InternalCarpilot.g:709:3: ( 'backward' )
                    {
                     before(grammarAccess.getDirectionAccess().getBackwardEnumLiteralDeclaration_3()); 
                    // InternalCarpilot.g:710:3: ( 'backward' )
                    // InternalCarpilot.g:710:4: 'backward'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getBackwardEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:714:2: ( ( 'stop' ) )
                    {
                    // InternalCarpilot.g:714:2: ( ( 'stop' ) )
                    // InternalCarpilot.g:715:3: ( 'stop' )
                    {
                     before(grammarAccess.getDirectionAccess().getStopEnumLiteralDeclaration_4()); 
                    // InternalCarpilot.g:716:3: ( 'stop' )
                    // InternalCarpilot.g:716:4: 'stop'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getStopEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalCarpilot.g:724:1: rule__Sensor__Alternatives : ( ( ( 'distance left' ) ) | ( ( 'distance right' ) ) | ( ( 'front' ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:728:1: ( ( ( 'distance left' ) ) | ( ( 'distance right' ) ) | ( ( 'front' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCarpilot.g:729:2: ( ( 'distance left' ) )
                    {
                    // InternalCarpilot.g:729:2: ( ( 'distance left' ) )
                    // InternalCarpilot.g:730:3: ( 'distance left' )
                    {
                     before(grammarAccess.getSensorAccess().getDistance_leftEnumLiteralDeclaration_0()); 
                    // InternalCarpilot.g:731:3: ( 'distance left' )
                    // InternalCarpilot.g:731:4: 'distance left'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorAccess().getDistance_leftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:735:2: ( ( 'distance right' ) )
                    {
                    // InternalCarpilot.g:735:2: ( ( 'distance right' ) )
                    // InternalCarpilot.g:736:3: ( 'distance right' )
                    {
                     before(grammarAccess.getSensorAccess().getDistance_rightEnumLiteralDeclaration_1()); 
                    // InternalCarpilot.g:737:3: ( 'distance right' )
                    // InternalCarpilot.g:737:4: 'distance right'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorAccess().getDistance_rightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:741:2: ( ( 'front' ) )
                    {
                    // InternalCarpilot.g:741:2: ( ( 'front' ) )
                    // InternalCarpilot.g:742:3: ( 'front' )
                    {
                     before(grammarAccess.getSensorAccess().getFrontEnumLiteralDeclaration_2()); 
                    // InternalCarpilot.g:743:3: ( 'front' )
                    // InternalCarpilot.g:743:4: 'front'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorAccess().getFrontEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Car__Group__0"
    // InternalCarpilot.g:751:1: rule__Car__Group__0 : rule__Car__Group__0__Impl rule__Car__Group__1 ;
    public final void rule__Car__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:755:1: ( rule__Car__Group__0__Impl rule__Car__Group__1 )
            // InternalCarpilot.g:756:2: rule__Car__Group__0__Impl rule__Car__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Car__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__1();

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
    // $ANTLR end "rule__Car__Group__0"


    // $ANTLR start "rule__Car__Group__0__Impl"
    // InternalCarpilot.g:763:1: rule__Car__Group__0__Impl : ( ( rule__Car__Group_0__0 )? ) ;
    public final void rule__Car__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:767:1: ( ( ( rule__Car__Group_0__0 )? ) )
            // InternalCarpilot.g:768:1: ( ( rule__Car__Group_0__0 )? )
            {
            // InternalCarpilot.g:768:1: ( ( rule__Car__Group_0__0 )? )
            // InternalCarpilot.g:769:2: ( rule__Car__Group_0__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_0()); 
            // InternalCarpilot.g:770:2: ( rule__Car__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCarpilot.g:770:3: rule__Car__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Car__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Car__Group__0__Impl"


    // $ANTLR start "rule__Car__Group__1"
    // InternalCarpilot.g:778:1: rule__Car__Group__1 : rule__Car__Group__1__Impl rule__Car__Group__2 ;
    public final void rule__Car__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:782:1: ( rule__Car__Group__1__Impl rule__Car__Group__2 )
            // InternalCarpilot.g:783:2: rule__Car__Group__1__Impl rule__Car__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Car__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__2();

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
    // $ANTLR end "rule__Car__Group__1"


    // $ANTLR start "rule__Car__Group__1__Impl"
    // InternalCarpilot.g:790:1: rule__Car__Group__1__Impl : ( ( rule__Car__Group_1__0 )? ) ;
    public final void rule__Car__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:794:1: ( ( ( rule__Car__Group_1__0 )? ) )
            // InternalCarpilot.g:795:1: ( ( rule__Car__Group_1__0 )? )
            {
            // InternalCarpilot.g:795:1: ( ( rule__Car__Group_1__0 )? )
            // InternalCarpilot.g:796:2: ( rule__Car__Group_1__0 )?
            {
             before(grammarAccess.getCarAccess().getGroup_1()); 
            // InternalCarpilot.g:797:2: ( rule__Car__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCarpilot.g:797:3: rule__Car__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Car__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCarAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Car__Group__1__Impl"


    // $ANTLR start "rule__Car__Group__2"
    // InternalCarpilot.g:805:1: rule__Car__Group__2 : rule__Car__Group__2__Impl rule__Car__Group__3 ;
    public final void rule__Car__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:809:1: ( rule__Car__Group__2__Impl rule__Car__Group__3 )
            // InternalCarpilot.g:810:2: rule__Car__Group__2__Impl rule__Car__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Car__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__3();

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
    // $ANTLR end "rule__Car__Group__2"


    // $ANTLR start "rule__Car__Group__2__Impl"
    // InternalCarpilot.g:817:1: rule__Car__Group__2__Impl : ( 'orders:' ) ;
    public final void rule__Car__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:821:1: ( ( 'orders:' ) )
            // InternalCarpilot.g:822:1: ( 'orders:' )
            {
            // InternalCarpilot.g:822:1: ( 'orders:' )
            // InternalCarpilot.g:823:2: 'orders:'
            {
             before(grammarAccess.getCarAccess().getOrdersKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getOrdersKeyword_2()); 

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
    // $ANTLR end "rule__Car__Group__2__Impl"


    // $ANTLR start "rule__Car__Group__3"
    // InternalCarpilot.g:832:1: rule__Car__Group__3 : rule__Car__Group__3__Impl rule__Car__Group__4 ;
    public final void rule__Car__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:836:1: ( rule__Car__Group__3__Impl rule__Car__Group__4 )
            // InternalCarpilot.g:837:2: rule__Car__Group__3__Impl rule__Car__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Car__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__4();

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
    // $ANTLR end "rule__Car__Group__3"


    // $ANTLR start "rule__Car__Group__3__Impl"
    // InternalCarpilot.g:844:1: rule__Car__Group__3__Impl : ( '\\n' ) ;
    public final void rule__Car__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:848:1: ( ( '\\n' ) )
            // InternalCarpilot.g:849:1: ( '\\n' )
            {
            // InternalCarpilot.g:849:1: ( '\\n' )
            // InternalCarpilot.g:850:2: '\\n'
            {
             before(grammarAccess.getCarAccess().getLineFeedKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getLineFeedKeyword_3()); 

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
    // $ANTLR end "rule__Car__Group__3__Impl"


    // $ANTLR start "rule__Car__Group__4"
    // InternalCarpilot.g:859:1: rule__Car__Group__4 : rule__Car__Group__4__Impl rule__Car__Group__5 ;
    public final void rule__Car__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:863:1: ( rule__Car__Group__4__Impl rule__Car__Group__5 )
            // InternalCarpilot.g:864:2: rule__Car__Group__4__Impl rule__Car__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Car__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group__5();

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
    // $ANTLR end "rule__Car__Group__4"


    // $ANTLR start "rule__Car__Group__4__Impl"
    // InternalCarpilot.g:871:1: rule__Car__Group__4__Impl : ( ( rule__Car__OrdersAssignment_4 ) ) ;
    public final void rule__Car__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:875:1: ( ( ( rule__Car__OrdersAssignment_4 ) ) )
            // InternalCarpilot.g:876:1: ( ( rule__Car__OrdersAssignment_4 ) )
            {
            // InternalCarpilot.g:876:1: ( ( rule__Car__OrdersAssignment_4 ) )
            // InternalCarpilot.g:877:2: ( rule__Car__OrdersAssignment_4 )
            {
             before(grammarAccess.getCarAccess().getOrdersAssignment_4()); 
            // InternalCarpilot.g:878:2: ( rule__Car__OrdersAssignment_4 )
            // InternalCarpilot.g:878:3: rule__Car__OrdersAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Car__OrdersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getOrdersAssignment_4()); 

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
    // $ANTLR end "rule__Car__Group__4__Impl"


    // $ANTLR start "rule__Car__Group__5"
    // InternalCarpilot.g:886:1: rule__Car__Group__5 : rule__Car__Group__5__Impl ;
    public final void rule__Car__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:890:1: ( rule__Car__Group__5__Impl )
            // InternalCarpilot.g:891:2: rule__Car__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group__5__Impl();

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
    // $ANTLR end "rule__Car__Group__5"


    // $ANTLR start "rule__Car__Group__5__Impl"
    // InternalCarpilot.g:897:1: rule__Car__Group__5__Impl : ( ( rule__Car__Group_5__0 )* ) ;
    public final void rule__Car__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:901:1: ( ( ( rule__Car__Group_5__0 )* ) )
            // InternalCarpilot.g:902:1: ( ( rule__Car__Group_5__0 )* )
            {
            // InternalCarpilot.g:902:1: ( ( rule__Car__Group_5__0 )* )
            // InternalCarpilot.g:903:2: ( rule__Car__Group_5__0 )*
            {
             before(grammarAccess.getCarAccess().getGroup_5()); 
            // InternalCarpilot.g:904:2: ( rule__Car__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCarpilot.g:904:3: rule__Car__Group_5__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Car__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCarAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Car__Group__5__Impl"


    // $ANTLR start "rule__Car__Group_0__0"
    // InternalCarpilot.g:913:1: rule__Car__Group_0__0 : rule__Car__Group_0__0__Impl rule__Car__Group_0__1 ;
    public final void rule__Car__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:917:1: ( rule__Car__Group_0__0__Impl rule__Car__Group_0__1 )
            // InternalCarpilot.g:918:2: rule__Car__Group_0__0__Impl rule__Car__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Car__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_0__1();

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
    // $ANTLR end "rule__Car__Group_0__0"


    // $ANTLR start "rule__Car__Group_0__0__Impl"
    // InternalCarpilot.g:925:1: rule__Car__Group_0__0__Impl : ( 'named' ) ;
    public final void rule__Car__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:929:1: ( ( 'named' ) )
            // InternalCarpilot.g:930:1: ( 'named' )
            {
            // InternalCarpilot.g:930:1: ( 'named' )
            // InternalCarpilot.g:931:2: 'named'
            {
             before(grammarAccess.getCarAccess().getNamedKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getNamedKeyword_0_0()); 

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
    // $ANTLR end "rule__Car__Group_0__0__Impl"


    // $ANTLR start "rule__Car__Group_0__1"
    // InternalCarpilot.g:940:1: rule__Car__Group_0__1 : rule__Car__Group_0__1__Impl ;
    public final void rule__Car__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:944:1: ( rule__Car__Group_0__1__Impl )
            // InternalCarpilot.g:945:2: rule__Car__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group_0__1__Impl();

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
    // $ANTLR end "rule__Car__Group_0__1"


    // $ANTLR start "rule__Car__Group_0__1__Impl"
    // InternalCarpilot.g:951:1: rule__Car__Group_0__1__Impl : ( ( rule__Car__NameAssignment_0_1 ) ) ;
    public final void rule__Car__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:955:1: ( ( ( rule__Car__NameAssignment_0_1 ) ) )
            // InternalCarpilot.g:956:1: ( ( rule__Car__NameAssignment_0_1 ) )
            {
            // InternalCarpilot.g:956:1: ( ( rule__Car__NameAssignment_0_1 ) )
            // InternalCarpilot.g:957:2: ( rule__Car__NameAssignment_0_1 )
            {
             before(grammarAccess.getCarAccess().getNameAssignment_0_1()); 
            // InternalCarpilot.g:958:2: ( rule__Car__NameAssignment_0_1 )
            // InternalCarpilot.g:958:3: rule__Car__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Car__Group_0__1__Impl"


    // $ANTLR start "rule__Car__Group_1__0"
    // InternalCarpilot.g:967:1: rule__Car__Group_1__0 : rule__Car__Group_1__0__Impl rule__Car__Group_1__1 ;
    public final void rule__Car__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:971:1: ( rule__Car__Group_1__0__Impl rule__Car__Group_1__1 )
            // InternalCarpilot.g:972:2: rule__Car__Group_1__0__Impl rule__Car__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Car__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_1__1();

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
    // $ANTLR end "rule__Car__Group_1__0"


    // $ANTLR start "rule__Car__Group_1__0__Impl"
    // InternalCarpilot.g:979:1: rule__Car__Group_1__0__Impl : ( 'rules:\\n' ) ;
    public final void rule__Car__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:983:1: ( ( 'rules:\\n' ) )
            // InternalCarpilot.g:984:1: ( 'rules:\\n' )
            {
            // InternalCarpilot.g:984:1: ( 'rules:\\n' )
            // InternalCarpilot.g:985:2: 'rules:\\n'
            {
             before(grammarAccess.getCarAccess().getRulesKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getRulesKeyword_1_0()); 

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
    // $ANTLR end "rule__Car__Group_1__0__Impl"


    // $ANTLR start "rule__Car__Group_1__1"
    // InternalCarpilot.g:994:1: rule__Car__Group_1__1 : rule__Car__Group_1__1__Impl rule__Car__Group_1__2 ;
    public final void rule__Car__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:998:1: ( rule__Car__Group_1__1__Impl rule__Car__Group_1__2 )
            // InternalCarpilot.g:999:2: rule__Car__Group_1__1__Impl rule__Car__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Car__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_1__2();

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
    // $ANTLR end "rule__Car__Group_1__1"


    // $ANTLR start "rule__Car__Group_1__1__Impl"
    // InternalCarpilot.g:1006:1: rule__Car__Group_1__1__Impl : ( ( rule__Car__RulesAssignment_1_1 ) ) ;
    public final void rule__Car__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1010:1: ( ( ( rule__Car__RulesAssignment_1_1 ) ) )
            // InternalCarpilot.g:1011:1: ( ( rule__Car__RulesAssignment_1_1 ) )
            {
            // InternalCarpilot.g:1011:1: ( ( rule__Car__RulesAssignment_1_1 ) )
            // InternalCarpilot.g:1012:2: ( rule__Car__RulesAssignment_1_1 )
            {
             before(grammarAccess.getCarAccess().getRulesAssignment_1_1()); 
            // InternalCarpilot.g:1013:2: ( rule__Car__RulesAssignment_1_1 )
            // InternalCarpilot.g:1013:3: rule__Car__RulesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__RulesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getRulesAssignment_1_1()); 

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
    // $ANTLR end "rule__Car__Group_1__1__Impl"


    // $ANTLR start "rule__Car__Group_1__2"
    // InternalCarpilot.g:1021:1: rule__Car__Group_1__2 : rule__Car__Group_1__2__Impl ;
    public final void rule__Car__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1025:1: ( rule__Car__Group_1__2__Impl )
            // InternalCarpilot.g:1026:2: rule__Car__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group_1__2__Impl();

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
    // $ANTLR end "rule__Car__Group_1__2"


    // $ANTLR start "rule__Car__Group_1__2__Impl"
    // InternalCarpilot.g:1032:1: rule__Car__Group_1__2__Impl : ( ( rule__Car__Group_1_2__0 )* ) ;
    public final void rule__Car__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1036:1: ( ( ( rule__Car__Group_1_2__0 )* ) )
            // InternalCarpilot.g:1037:1: ( ( rule__Car__Group_1_2__0 )* )
            {
            // InternalCarpilot.g:1037:1: ( ( rule__Car__Group_1_2__0 )* )
            // InternalCarpilot.g:1038:2: ( rule__Car__Group_1_2__0 )*
            {
             before(grammarAccess.getCarAccess().getGroup_1_2()); 
            // InternalCarpilot.g:1039:2: ( rule__Car__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCarpilot.g:1039:3: rule__Car__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Car__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCarAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Car__Group_1__2__Impl"


    // $ANTLR start "rule__Car__Group_1_2__0"
    // InternalCarpilot.g:1048:1: rule__Car__Group_1_2__0 : rule__Car__Group_1_2__0__Impl rule__Car__Group_1_2__1 ;
    public final void rule__Car__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1052:1: ( rule__Car__Group_1_2__0__Impl rule__Car__Group_1_2__1 )
            // InternalCarpilot.g:1053:2: rule__Car__Group_1_2__0__Impl rule__Car__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Car__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_1_2__1();

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
    // $ANTLR end "rule__Car__Group_1_2__0"


    // $ANTLR start "rule__Car__Group_1_2__0__Impl"
    // InternalCarpilot.g:1060:1: rule__Car__Group_1_2__0__Impl : ( '\\n' ) ;
    public final void rule__Car__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1064:1: ( ( '\\n' ) )
            // InternalCarpilot.g:1065:1: ( '\\n' )
            {
            // InternalCarpilot.g:1065:1: ( '\\n' )
            // InternalCarpilot.g:1066:2: '\\n'
            {
             before(grammarAccess.getCarAccess().getLineFeedKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getLineFeedKeyword_1_2_0()); 

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
    // $ANTLR end "rule__Car__Group_1_2__0__Impl"


    // $ANTLR start "rule__Car__Group_1_2__1"
    // InternalCarpilot.g:1075:1: rule__Car__Group_1_2__1 : rule__Car__Group_1_2__1__Impl ;
    public final void rule__Car__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1079:1: ( rule__Car__Group_1_2__1__Impl )
            // InternalCarpilot.g:1080:2: rule__Car__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Car__Group_1_2__1"


    // $ANTLR start "rule__Car__Group_1_2__1__Impl"
    // InternalCarpilot.g:1086:1: rule__Car__Group_1_2__1__Impl : ( ( rule__Car__RulesAssignment_1_2_1 ) ) ;
    public final void rule__Car__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1090:1: ( ( ( rule__Car__RulesAssignment_1_2_1 ) ) )
            // InternalCarpilot.g:1091:1: ( ( rule__Car__RulesAssignment_1_2_1 ) )
            {
            // InternalCarpilot.g:1091:1: ( ( rule__Car__RulesAssignment_1_2_1 ) )
            // InternalCarpilot.g:1092:2: ( rule__Car__RulesAssignment_1_2_1 )
            {
             before(grammarAccess.getCarAccess().getRulesAssignment_1_2_1()); 
            // InternalCarpilot.g:1093:2: ( rule__Car__RulesAssignment_1_2_1 )
            // InternalCarpilot.g:1093:3: rule__Car__RulesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__RulesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getRulesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Car__Group_1_2__1__Impl"


    // $ANTLR start "rule__Car__Group_5__0"
    // InternalCarpilot.g:1102:1: rule__Car__Group_5__0 : rule__Car__Group_5__0__Impl rule__Car__Group_5__1 ;
    public final void rule__Car__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1106:1: ( rule__Car__Group_5__0__Impl rule__Car__Group_5__1 )
            // InternalCarpilot.g:1107:2: rule__Car__Group_5__0__Impl rule__Car__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Car__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Car__Group_5__1();

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
    // $ANTLR end "rule__Car__Group_5__0"


    // $ANTLR start "rule__Car__Group_5__0__Impl"
    // InternalCarpilot.g:1114:1: rule__Car__Group_5__0__Impl : ( '\\n' ) ;
    public final void rule__Car__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1118:1: ( ( '\\n' ) )
            // InternalCarpilot.g:1119:1: ( '\\n' )
            {
            // InternalCarpilot.g:1119:1: ( '\\n' )
            // InternalCarpilot.g:1120:2: '\\n'
            {
             before(grammarAccess.getCarAccess().getLineFeedKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCarAccess().getLineFeedKeyword_5_0()); 

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
    // $ANTLR end "rule__Car__Group_5__0__Impl"


    // $ANTLR start "rule__Car__Group_5__1"
    // InternalCarpilot.g:1129:1: rule__Car__Group_5__1 : rule__Car__Group_5__1__Impl ;
    public final void rule__Car__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1133:1: ( rule__Car__Group_5__1__Impl )
            // InternalCarpilot.g:1134:2: rule__Car__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Car__Group_5__1__Impl();

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
    // $ANTLR end "rule__Car__Group_5__1"


    // $ANTLR start "rule__Car__Group_5__1__Impl"
    // InternalCarpilot.g:1140:1: rule__Car__Group_5__1__Impl : ( ( rule__Car__OrdersAssignment_5_1 ) ) ;
    public final void rule__Car__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1144:1: ( ( ( rule__Car__OrdersAssignment_5_1 ) ) )
            // InternalCarpilot.g:1145:1: ( ( rule__Car__OrdersAssignment_5_1 ) )
            {
            // InternalCarpilot.g:1145:1: ( ( rule__Car__OrdersAssignment_5_1 ) )
            // InternalCarpilot.g:1146:2: ( rule__Car__OrdersAssignment_5_1 )
            {
             before(grammarAccess.getCarAccess().getOrdersAssignment_5_1()); 
            // InternalCarpilot.g:1147:2: ( rule__Car__OrdersAssignment_5_1 )
            // InternalCarpilot.g:1147:3: rule__Car__OrdersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Car__OrdersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCarAccess().getOrdersAssignment_5_1()); 

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
    // $ANTLR end "rule__Car__Group_5__1__Impl"


    // $ANTLR start "rule__DirectRule__Group__0"
    // InternalCarpilot.g:1156:1: rule__DirectRule__Group__0 : rule__DirectRule__Group__0__Impl rule__DirectRule__Group__1 ;
    public final void rule__DirectRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1160:1: ( rule__DirectRule__Group__0__Impl rule__DirectRule__Group__1 )
            // InternalCarpilot.g:1161:2: rule__DirectRule__Group__0__Impl rule__DirectRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DirectRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectRule__Group__1();

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
    // $ANTLR end "rule__DirectRule__Group__0"


    // $ANTLR start "rule__DirectRule__Group__0__Impl"
    // InternalCarpilot.g:1168:1: rule__DirectRule__Group__0__Impl : ( ( rule__DirectRule__ConditionAssignment_0 ) ) ;
    public final void rule__DirectRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1172:1: ( ( ( rule__DirectRule__ConditionAssignment_0 ) ) )
            // InternalCarpilot.g:1173:1: ( ( rule__DirectRule__ConditionAssignment_0 ) )
            {
            // InternalCarpilot.g:1173:1: ( ( rule__DirectRule__ConditionAssignment_0 ) )
            // InternalCarpilot.g:1174:2: ( rule__DirectRule__ConditionAssignment_0 )
            {
             before(grammarAccess.getDirectRuleAccess().getConditionAssignment_0()); 
            // InternalCarpilot.g:1175:2: ( rule__DirectRule__ConditionAssignment_0 )
            // InternalCarpilot.g:1175:3: rule__DirectRule__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectRule__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectRuleAccess().getConditionAssignment_0()); 

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
    // $ANTLR end "rule__DirectRule__Group__0__Impl"


    // $ANTLR start "rule__DirectRule__Group__1"
    // InternalCarpilot.g:1183:1: rule__DirectRule__Group__1 : rule__DirectRule__Group__1__Impl rule__DirectRule__Group__2 ;
    public final void rule__DirectRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1187:1: ( rule__DirectRule__Group__1__Impl rule__DirectRule__Group__2 )
            // InternalCarpilot.g:1188:2: rule__DirectRule__Group__1__Impl rule__DirectRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DirectRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectRule__Group__2();

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
    // $ANTLR end "rule__DirectRule__Group__1"


    // $ANTLR start "rule__DirectRule__Group__1__Impl"
    // InternalCarpilot.g:1195:1: rule__DirectRule__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1199:1: ( ( '->' ) )
            // InternalCarpilot.g:1200:1: ( '->' )
            {
            // InternalCarpilot.g:1200:1: ( '->' )
            // InternalCarpilot.g:1201:2: '->'
            {
             before(grammarAccess.getDirectRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDirectRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DirectRule__Group__1__Impl"


    // $ANTLR start "rule__DirectRule__Group__2"
    // InternalCarpilot.g:1210:1: rule__DirectRule__Group__2 : rule__DirectRule__Group__2__Impl ;
    public final void rule__DirectRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1214:1: ( rule__DirectRule__Group__2__Impl )
            // InternalCarpilot.g:1215:2: rule__DirectRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectRule__Group__2__Impl();

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
    // $ANTLR end "rule__DirectRule__Group__2"


    // $ANTLR start "rule__DirectRule__Group__2__Impl"
    // InternalCarpilot.g:1221:1: rule__DirectRule__Group__2__Impl : ( ( rule__DirectRule__EffectAssignment_2 ) ) ;
    public final void rule__DirectRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1225:1: ( ( ( rule__DirectRule__EffectAssignment_2 ) ) )
            // InternalCarpilot.g:1226:1: ( ( rule__DirectRule__EffectAssignment_2 ) )
            {
            // InternalCarpilot.g:1226:1: ( ( rule__DirectRule__EffectAssignment_2 ) )
            // InternalCarpilot.g:1227:2: ( rule__DirectRule__EffectAssignment_2 )
            {
             before(grammarAccess.getDirectRuleAccess().getEffectAssignment_2()); 
            // InternalCarpilot.g:1228:2: ( rule__DirectRule__EffectAssignment_2 )
            // InternalCarpilot.g:1228:3: rule__DirectRule__EffectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DirectRule__EffectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectRuleAccess().getEffectAssignment_2()); 

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
    // $ANTLR end "rule__DirectRule__Group__2__Impl"


    // $ANTLR start "rule__PersistingRule__Group__0"
    // InternalCarpilot.g:1237:1: rule__PersistingRule__Group__0 : rule__PersistingRule__Group__0__Impl rule__PersistingRule__Group__1 ;
    public final void rule__PersistingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1241:1: ( rule__PersistingRule__Group__0__Impl rule__PersistingRule__Group__1 )
            // InternalCarpilot.g:1242:2: rule__PersistingRule__Group__0__Impl rule__PersistingRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PersistingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__1();

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
    // $ANTLR end "rule__PersistingRule__Group__0"


    // $ANTLR start "rule__PersistingRule__Group__0__Impl"
    // InternalCarpilot.g:1249:1: rule__PersistingRule__Group__0__Impl : ( ( rule__PersistingRule__ConditionAssignment_0 ) ) ;
    public final void rule__PersistingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1253:1: ( ( ( rule__PersistingRule__ConditionAssignment_0 ) ) )
            // InternalCarpilot.g:1254:1: ( ( rule__PersistingRule__ConditionAssignment_0 ) )
            {
            // InternalCarpilot.g:1254:1: ( ( rule__PersistingRule__ConditionAssignment_0 ) )
            // InternalCarpilot.g:1255:2: ( rule__PersistingRule__ConditionAssignment_0 )
            {
             before(grammarAccess.getPersistingRuleAccess().getConditionAssignment_0()); 
            // InternalCarpilot.g:1256:2: ( rule__PersistingRule__ConditionAssignment_0 )
            // InternalCarpilot.g:1256:3: rule__PersistingRule__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PersistingRule__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersistingRuleAccess().getConditionAssignment_0()); 

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
    // $ANTLR end "rule__PersistingRule__Group__0__Impl"


    // $ANTLR start "rule__PersistingRule__Group__1"
    // InternalCarpilot.g:1264:1: rule__PersistingRule__Group__1 : rule__PersistingRule__Group__1__Impl rule__PersistingRule__Group__2 ;
    public final void rule__PersistingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1268:1: ( rule__PersistingRule__Group__1__Impl rule__PersistingRule__Group__2 )
            // InternalCarpilot.g:1269:2: rule__PersistingRule__Group__1__Impl rule__PersistingRule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__PersistingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__2();

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
    // $ANTLR end "rule__PersistingRule__Group__1"


    // $ANTLR start "rule__PersistingRule__Group__1__Impl"
    // InternalCarpilot.g:1276:1: rule__PersistingRule__Group__1__Impl : ( '->' ) ;
    public final void rule__PersistingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1280:1: ( ( '->' ) )
            // InternalCarpilot.g:1281:1: ( '->' )
            {
            // InternalCarpilot.g:1281:1: ( '->' )
            // InternalCarpilot.g:1282:2: '->'
            {
             before(grammarAccess.getPersistingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPersistingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__PersistingRule__Group__1__Impl"


    // $ANTLR start "rule__PersistingRule__Group__2"
    // InternalCarpilot.g:1291:1: rule__PersistingRule__Group__2 : rule__PersistingRule__Group__2__Impl rule__PersistingRule__Group__3 ;
    public final void rule__PersistingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1295:1: ( rule__PersistingRule__Group__2__Impl rule__PersistingRule__Group__3 )
            // InternalCarpilot.g:1296:2: rule__PersistingRule__Group__2__Impl rule__PersistingRule__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__PersistingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__3();

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
    // $ANTLR end "rule__PersistingRule__Group__2"


    // $ANTLR start "rule__PersistingRule__Group__2__Impl"
    // InternalCarpilot.g:1303:1: rule__PersistingRule__Group__2__Impl : ( ( rule__PersistingRule__EffectAssignment_2 ) ) ;
    public final void rule__PersistingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1307:1: ( ( ( rule__PersistingRule__EffectAssignment_2 ) ) )
            // InternalCarpilot.g:1308:1: ( ( rule__PersistingRule__EffectAssignment_2 ) )
            {
            // InternalCarpilot.g:1308:1: ( ( rule__PersistingRule__EffectAssignment_2 ) )
            // InternalCarpilot.g:1309:2: ( rule__PersistingRule__EffectAssignment_2 )
            {
             before(grammarAccess.getPersistingRuleAccess().getEffectAssignment_2()); 
            // InternalCarpilot.g:1310:2: ( rule__PersistingRule__EffectAssignment_2 )
            // InternalCarpilot.g:1310:3: rule__PersistingRule__EffectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PersistingRule__EffectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersistingRuleAccess().getEffectAssignment_2()); 

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
    // $ANTLR end "rule__PersistingRule__Group__2__Impl"


    // $ANTLR start "rule__PersistingRule__Group__3"
    // InternalCarpilot.g:1318:1: rule__PersistingRule__Group__3 : rule__PersistingRule__Group__3__Impl rule__PersistingRule__Group__4 ;
    public final void rule__PersistingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1322:1: ( rule__PersistingRule__Group__3__Impl rule__PersistingRule__Group__4 )
            // InternalCarpilot.g:1323:2: rule__PersistingRule__Group__3__Impl rule__PersistingRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__PersistingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__4();

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
    // $ANTLR end "rule__PersistingRule__Group__3"


    // $ANTLR start "rule__PersistingRule__Group__3__Impl"
    // InternalCarpilot.g:1330:1: rule__PersistingRule__Group__3__Impl : ( 'until' ) ;
    public final void rule__PersistingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1334:1: ( ( 'until' ) )
            // InternalCarpilot.g:1335:1: ( 'until' )
            {
            // InternalCarpilot.g:1335:1: ( 'until' )
            // InternalCarpilot.g:1336:2: 'until'
            {
             before(grammarAccess.getPersistingRuleAccess().getUntilKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPersistingRuleAccess().getUntilKeyword_3()); 

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
    // $ANTLR end "rule__PersistingRule__Group__3__Impl"


    // $ANTLR start "rule__PersistingRule__Group__4"
    // InternalCarpilot.g:1345:1: rule__PersistingRule__Group__4 : rule__PersistingRule__Group__4__Impl ;
    public final void rule__PersistingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1349:1: ( rule__PersistingRule__Group__4__Impl )
            // InternalCarpilot.g:1350:2: rule__PersistingRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersistingRule__Group__4__Impl();

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
    // $ANTLR end "rule__PersistingRule__Group__4"


    // $ANTLR start "rule__PersistingRule__Group__4__Impl"
    // InternalCarpilot.g:1356:1: rule__PersistingRule__Group__4__Impl : ( ( rule__PersistingRule__StopAssignment_4 ) ) ;
    public final void rule__PersistingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1360:1: ( ( ( rule__PersistingRule__StopAssignment_4 ) ) )
            // InternalCarpilot.g:1361:1: ( ( rule__PersistingRule__StopAssignment_4 ) )
            {
            // InternalCarpilot.g:1361:1: ( ( rule__PersistingRule__StopAssignment_4 ) )
            // InternalCarpilot.g:1362:2: ( rule__PersistingRule__StopAssignment_4 )
            {
             before(grammarAccess.getPersistingRuleAccess().getStopAssignment_4()); 
            // InternalCarpilot.g:1363:2: ( rule__PersistingRule__StopAssignment_4 )
            // InternalCarpilot.g:1363:3: rule__PersistingRule__StopAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PersistingRule__StopAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersistingRuleAccess().getStopAssignment_4()); 

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
    // $ANTLR end "rule__PersistingRule__Group__4__Impl"


    // $ANTLR start "rule__AbilityEffect__Group__0"
    // InternalCarpilot.g:1372:1: rule__AbilityEffect__Group__0 : rule__AbilityEffect__Group__0__Impl rule__AbilityEffect__Group__1 ;
    public final void rule__AbilityEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1376:1: ( rule__AbilityEffect__Group__0__Impl rule__AbilityEffect__Group__1 )
            // InternalCarpilot.g:1377:2: rule__AbilityEffect__Group__0__Impl rule__AbilityEffect__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AbilityEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbilityEffect__Group__1();

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
    // $ANTLR end "rule__AbilityEffect__Group__0"


    // $ANTLR start "rule__AbilityEffect__Group__0__Impl"
    // InternalCarpilot.g:1384:1: rule__AbilityEffect__Group__0__Impl : ( 'can' ) ;
    public final void rule__AbilityEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1388:1: ( ( 'can' ) )
            // InternalCarpilot.g:1389:1: ( 'can' )
            {
            // InternalCarpilot.g:1389:1: ( 'can' )
            // InternalCarpilot.g:1390:2: 'can'
            {
             before(grammarAccess.getAbilityEffectAccess().getCanKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAbilityEffectAccess().getCanKeyword_0()); 

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
    // $ANTLR end "rule__AbilityEffect__Group__0__Impl"


    // $ANTLR start "rule__AbilityEffect__Group__1"
    // InternalCarpilot.g:1399:1: rule__AbilityEffect__Group__1 : rule__AbilityEffect__Group__1__Impl rule__AbilityEffect__Group__2 ;
    public final void rule__AbilityEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1403:1: ( rule__AbilityEffect__Group__1__Impl rule__AbilityEffect__Group__2 )
            // InternalCarpilot.g:1404:2: rule__AbilityEffect__Group__1__Impl rule__AbilityEffect__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AbilityEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbilityEffect__Group__2();

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
    // $ANTLR end "rule__AbilityEffect__Group__1"


    // $ANTLR start "rule__AbilityEffect__Group__1__Impl"
    // InternalCarpilot.g:1411:1: rule__AbilityEffect__Group__1__Impl : ( ( rule__AbilityEffect__DisableAssignment_1 )? ) ;
    public final void rule__AbilityEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1415:1: ( ( ( rule__AbilityEffect__DisableAssignment_1 )? ) )
            // InternalCarpilot.g:1416:1: ( ( rule__AbilityEffect__DisableAssignment_1 )? )
            {
            // InternalCarpilot.g:1416:1: ( ( rule__AbilityEffect__DisableAssignment_1 )? )
            // InternalCarpilot.g:1417:2: ( rule__AbilityEffect__DisableAssignment_1 )?
            {
             before(grammarAccess.getAbilityEffectAccess().getDisableAssignment_1()); 
            // InternalCarpilot.g:1418:2: ( rule__AbilityEffect__DisableAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCarpilot.g:1418:3: rule__AbilityEffect__DisableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbilityEffect__DisableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbilityEffectAccess().getDisableAssignment_1()); 

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
    // $ANTLR end "rule__AbilityEffect__Group__1__Impl"


    // $ANTLR start "rule__AbilityEffect__Group__2"
    // InternalCarpilot.g:1426:1: rule__AbilityEffect__Group__2 : rule__AbilityEffect__Group__2__Impl rule__AbilityEffect__Group__3 ;
    public final void rule__AbilityEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1430:1: ( rule__AbilityEffect__Group__2__Impl rule__AbilityEffect__Group__3 )
            // InternalCarpilot.g:1431:2: rule__AbilityEffect__Group__2__Impl rule__AbilityEffect__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AbilityEffect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbilityEffect__Group__3();

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
    // $ANTLR end "rule__AbilityEffect__Group__2"


    // $ANTLR start "rule__AbilityEffect__Group__2__Impl"
    // InternalCarpilot.g:1438:1: rule__AbilityEffect__Group__2__Impl : ( 'go' ) ;
    public final void rule__AbilityEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1442:1: ( ( 'go' ) )
            // InternalCarpilot.g:1443:1: ( 'go' )
            {
            // InternalCarpilot.g:1443:1: ( 'go' )
            // InternalCarpilot.g:1444:2: 'go'
            {
             before(grammarAccess.getAbilityEffectAccess().getGoKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAbilityEffectAccess().getGoKeyword_2()); 

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
    // $ANTLR end "rule__AbilityEffect__Group__2__Impl"


    // $ANTLR start "rule__AbilityEffect__Group__3"
    // InternalCarpilot.g:1453:1: rule__AbilityEffect__Group__3 : rule__AbilityEffect__Group__3__Impl ;
    public final void rule__AbilityEffect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1457:1: ( rule__AbilityEffect__Group__3__Impl )
            // InternalCarpilot.g:1458:2: rule__AbilityEffect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbilityEffect__Group__3__Impl();

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
    // $ANTLR end "rule__AbilityEffect__Group__3"


    // $ANTLR start "rule__AbilityEffect__Group__3__Impl"
    // InternalCarpilot.g:1464:1: rule__AbilityEffect__Group__3__Impl : ( ( rule__AbilityEffect__DirectionAssignment_3 ) ) ;
    public final void rule__AbilityEffect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1468:1: ( ( ( rule__AbilityEffect__DirectionAssignment_3 ) ) )
            // InternalCarpilot.g:1469:1: ( ( rule__AbilityEffect__DirectionAssignment_3 ) )
            {
            // InternalCarpilot.g:1469:1: ( ( rule__AbilityEffect__DirectionAssignment_3 ) )
            // InternalCarpilot.g:1470:2: ( rule__AbilityEffect__DirectionAssignment_3 )
            {
             before(grammarAccess.getAbilityEffectAccess().getDirectionAssignment_3()); 
            // InternalCarpilot.g:1471:2: ( rule__AbilityEffect__DirectionAssignment_3 )
            // InternalCarpilot.g:1471:3: rule__AbilityEffect__DirectionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AbilityEffect__DirectionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAbilityEffectAccess().getDirectionAssignment_3()); 

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
    // $ANTLR end "rule__AbilityEffect__Group__3__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // InternalCarpilot.g:1480:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1484:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // InternalCarpilot.g:1485:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group__1();

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
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // InternalCarpilot.g:1492:1: rule__Command__Group__0__Impl : ( () ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1496:1: ( ( () ) )
            // InternalCarpilot.g:1497:1: ( () )
            {
            // InternalCarpilot.g:1497:1: ( () )
            // InternalCarpilot.g:1498:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_0()); 
            // InternalCarpilot.g:1499:2: ()
            // InternalCarpilot.g:1499:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // InternalCarpilot.g:1507:1: rule__Command__Group__1 : rule__Command__Group__1__Impl ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1511:1: ( rule__Command__Group__1__Impl )
            // InternalCarpilot.g:1512:2: rule__Command__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group__1__Impl();

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
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // InternalCarpilot.g:1518:1: rule__Command__Group__1__Impl : ( ( rule__Command__Group_1__0 )? ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1522:1: ( ( ( rule__Command__Group_1__0 )? ) )
            // InternalCarpilot.g:1523:1: ( ( rule__Command__Group_1__0 )? )
            {
            // InternalCarpilot.g:1523:1: ( ( rule__Command__Group_1__0 )? )
            // InternalCarpilot.g:1524:2: ( rule__Command__Group_1__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_1()); 
            // InternalCarpilot.g:1525:2: ( rule__Command__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=24 && LA16_0<=25)||(LA16_0>=27 && LA16_0<=29)||LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCarpilot.g:1525:3: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // InternalCarpilot.g:1534:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1538:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // InternalCarpilot.g:1539:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Command__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_1__1();

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
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // InternalCarpilot.g:1546:1: rule__Command__Group_1__0__Impl : ( ( 'go' )? ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1550:1: ( ( ( 'go' )? ) )
            // InternalCarpilot.g:1551:1: ( ( 'go' )? )
            {
            // InternalCarpilot.g:1551:1: ( ( 'go' )? )
            // InternalCarpilot.g:1552:2: ( 'go' )?
            {
             before(grammarAccess.getCommandAccess().getGoKeyword_1_0()); 
            // InternalCarpilot.g:1553:2: ( 'go' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCarpilot.g:1553:3: 'go'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGoKeyword_1_0()); 

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
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // InternalCarpilot.g:1561:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1565:1: ( rule__Command__Group_1__1__Impl )
            // InternalCarpilot.g:1566:2: rule__Command__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_1__1__Impl();

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
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // InternalCarpilot.g:1572:1: rule__Command__Group_1__1__Impl : ( ( rule__Command__DirectionAssignment_1_1 ) ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1576:1: ( ( ( rule__Command__DirectionAssignment_1_1 ) ) )
            // InternalCarpilot.g:1577:1: ( ( rule__Command__DirectionAssignment_1_1 ) )
            {
            // InternalCarpilot.g:1577:1: ( ( rule__Command__DirectionAssignment_1_1 ) )
            // InternalCarpilot.g:1578:2: ( rule__Command__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getCommandAccess().getDirectionAssignment_1_1()); 
            // InternalCarpilot.g:1579:2: ( rule__Command__DirectionAssignment_1_1 )
            // InternalCarpilot.g:1579:3: rule__Command__DirectionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Command__DirectionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getDirectionAssignment_1_1()); 

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
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__ColorCondition__Group_0__0"
    // InternalCarpilot.g:1588:1: rule__ColorCondition__Group_0__0 : rule__ColorCondition__Group_0__0__Impl rule__ColorCondition__Group_0__1 ;
    public final void rule__ColorCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1592:1: ( rule__ColorCondition__Group_0__0__Impl rule__ColorCondition__Group_0__1 )
            // InternalCarpilot.g:1593:2: rule__ColorCondition__Group_0__0__Impl rule__ColorCondition__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__ColorCondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0__1();

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
    // $ANTLR end "rule__ColorCondition__Group_0__0"


    // $ANTLR start "rule__ColorCondition__Group_0__0__Impl"
    // InternalCarpilot.g:1600:1: rule__ColorCondition__Group_0__0__Impl : ( () ) ;
    public final void rule__ColorCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1604:1: ( ( () ) )
            // InternalCarpilot.g:1605:1: ( () )
            {
            // InternalCarpilot.g:1605:1: ( () )
            // InternalCarpilot.g:1606:2: ()
            {
             before(grammarAccess.getColorConditionAccess().getColorConditionAction_0_0()); 
            // InternalCarpilot.g:1607:2: ()
            // InternalCarpilot.g:1607:3: 
            {
            }

             after(grammarAccess.getColorConditionAccess().getColorConditionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorCondition__Group_0__0__Impl"


    // $ANTLR start "rule__ColorCondition__Group_0__1"
    // InternalCarpilot.g:1615:1: rule__ColorCondition__Group_0__1 : rule__ColorCondition__Group_0__1__Impl ;
    public final void rule__ColorCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1619:1: ( rule__ColorCondition__Group_0__1__Impl )
            // InternalCarpilot.g:1620:2: rule__ColorCondition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0__1__Impl();

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
    // $ANTLR end "rule__ColorCondition__Group_0__1"


    // $ANTLR start "rule__ColorCondition__Group_0__1__Impl"
    // InternalCarpilot.g:1626:1: rule__ColorCondition__Group_0__1__Impl : ( ( rule__ColorCondition__Group_0_1__0 ) ) ;
    public final void rule__ColorCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1630:1: ( ( ( rule__ColorCondition__Group_0_1__0 ) ) )
            // InternalCarpilot.g:1631:1: ( ( rule__ColorCondition__Group_0_1__0 ) )
            {
            // InternalCarpilot.g:1631:1: ( ( rule__ColorCondition__Group_0_1__0 ) )
            // InternalCarpilot.g:1632:2: ( rule__ColorCondition__Group_0_1__0 )
            {
             before(grammarAccess.getColorConditionAccess().getGroup_0_1()); 
            // InternalCarpilot.g:1633:2: ( rule__ColorCondition__Group_0_1__0 )
            // InternalCarpilot.g:1633:3: rule__ColorCondition__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ColorCondition__Group_0__1__Impl"


    // $ANTLR start "rule__ColorCondition__Group_0_1__0"
    // InternalCarpilot.g:1642:1: rule__ColorCondition__Group_0_1__0 : rule__ColorCondition__Group_0_1__0__Impl rule__ColorCondition__Group_0_1__1 ;
    public final void rule__ColorCondition__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1646:1: ( rule__ColorCondition__Group_0_1__0__Impl rule__ColorCondition__Group_0_1__1 )
            // InternalCarpilot.g:1647:2: rule__ColorCondition__Group_0_1__0__Impl rule__ColorCondition__Group_0_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ColorCondition__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0_1__1();

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__0"


    // $ANTLR start "rule__ColorCondition__Group_0_1__0__Impl"
    // InternalCarpilot.g:1654:1: rule__ColorCondition__Group_0_1__0__Impl : ( ( rule__ColorCondition__ColorAssignment_0_1_0 ) ) ;
    public final void rule__ColorCondition__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1658:1: ( ( ( rule__ColorCondition__ColorAssignment_0_1_0 ) ) )
            // InternalCarpilot.g:1659:1: ( ( rule__ColorCondition__ColorAssignment_0_1_0 ) )
            {
            // InternalCarpilot.g:1659:1: ( ( rule__ColorCondition__ColorAssignment_0_1_0 ) )
            // InternalCarpilot.g:1660:2: ( rule__ColorCondition__ColorAssignment_0_1_0 )
            {
             before(grammarAccess.getColorConditionAccess().getColorAssignment_0_1_0()); 
            // InternalCarpilot.g:1661:2: ( rule__ColorCondition__ColorAssignment_0_1_0 )
            // InternalCarpilot.g:1661:3: rule__ColorCondition__ColorAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__ColorAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getColorAssignment_0_1_0()); 

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__0__Impl"


    // $ANTLR start "rule__ColorCondition__Group_0_1__1"
    // InternalCarpilot.g:1669:1: rule__ColorCondition__Group_0_1__1 : rule__ColorCondition__Group_0_1__1__Impl rule__ColorCondition__Group_0_1__2 ;
    public final void rule__ColorCondition__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1673:1: ( rule__ColorCondition__Group_0_1__1__Impl rule__ColorCondition__Group_0_1__2 )
            // InternalCarpilot.g:1674:2: rule__ColorCondition__Group_0_1__1__Impl rule__ColorCondition__Group_0_1__2
            {
            pushFollow(FOLLOW_15);
            rule__ColorCondition__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0_1__2();

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__1"


    // $ANTLR start "rule__ColorCondition__Group_0_1__1__Impl"
    // InternalCarpilot.g:1681:1: rule__ColorCondition__Group_0_1__1__Impl : ( '==' ) ;
    public final void rule__ColorCondition__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1685:1: ( ( '==' ) )
            // InternalCarpilot.g:1686:1: ( '==' )
            {
            // InternalCarpilot.g:1686:1: ( '==' )
            // InternalCarpilot.g:1687:2: '=='
            {
             before(grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_0_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_0_1_1()); 

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__1__Impl"


    // $ANTLR start "rule__ColorCondition__Group_0_1__2"
    // InternalCarpilot.g:1696:1: rule__ColorCondition__Group_0_1__2 : rule__ColorCondition__Group_0_1__2__Impl ;
    public final void rule__ColorCondition__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1700:1: ( rule__ColorCondition__Group_0_1__2__Impl )
            // InternalCarpilot.g:1701:2: rule__ColorCondition__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__2"


    // $ANTLR start "rule__ColorCondition__Group_0_1__2__Impl"
    // InternalCarpilot.g:1707:1: rule__ColorCondition__Group_0_1__2__Impl : ( ( rule__ColorCondition__CameraAssignment_0_1_2 ) ) ;
    public final void rule__ColorCondition__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1711:1: ( ( ( rule__ColorCondition__CameraAssignment_0_1_2 ) ) )
            // InternalCarpilot.g:1712:1: ( ( rule__ColorCondition__CameraAssignment_0_1_2 ) )
            {
            // InternalCarpilot.g:1712:1: ( ( rule__ColorCondition__CameraAssignment_0_1_2 ) )
            // InternalCarpilot.g:1713:2: ( rule__ColorCondition__CameraAssignment_0_1_2 )
            {
             before(grammarAccess.getColorConditionAccess().getCameraAssignment_0_1_2()); 
            // InternalCarpilot.g:1714:2: ( rule__ColorCondition__CameraAssignment_0_1_2 )
            // InternalCarpilot.g:1714:3: rule__ColorCondition__CameraAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__CameraAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getCameraAssignment_0_1_2()); 

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
    // $ANTLR end "rule__ColorCondition__Group_0_1__2__Impl"


    // $ANTLR start "rule__ColorCondition__Group_1__0"
    // InternalCarpilot.g:1723:1: rule__ColorCondition__Group_1__0 : rule__ColorCondition__Group_1__0__Impl rule__ColorCondition__Group_1__1 ;
    public final void rule__ColorCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1727:1: ( rule__ColorCondition__Group_1__0__Impl rule__ColorCondition__Group_1__1 )
            // InternalCarpilot.g:1728:2: rule__ColorCondition__Group_1__0__Impl rule__ColorCondition__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ColorCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_1__1();

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
    // $ANTLR end "rule__ColorCondition__Group_1__0"


    // $ANTLR start "rule__ColorCondition__Group_1__0__Impl"
    // InternalCarpilot.g:1735:1: rule__ColorCondition__Group_1__0__Impl : ( ( rule__ColorCondition__CameraAssignment_1_0 ) ) ;
    public final void rule__ColorCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1739:1: ( ( ( rule__ColorCondition__CameraAssignment_1_0 ) ) )
            // InternalCarpilot.g:1740:1: ( ( rule__ColorCondition__CameraAssignment_1_0 ) )
            {
            // InternalCarpilot.g:1740:1: ( ( rule__ColorCondition__CameraAssignment_1_0 ) )
            // InternalCarpilot.g:1741:2: ( rule__ColorCondition__CameraAssignment_1_0 )
            {
             before(grammarAccess.getColorConditionAccess().getCameraAssignment_1_0()); 
            // InternalCarpilot.g:1742:2: ( rule__ColorCondition__CameraAssignment_1_0 )
            // InternalCarpilot.g:1742:3: rule__ColorCondition__CameraAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__CameraAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getCameraAssignment_1_0()); 

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
    // $ANTLR end "rule__ColorCondition__Group_1__0__Impl"


    // $ANTLR start "rule__ColorCondition__Group_1__1"
    // InternalCarpilot.g:1750:1: rule__ColorCondition__Group_1__1 : rule__ColorCondition__Group_1__1__Impl rule__ColorCondition__Group_1__2 ;
    public final void rule__ColorCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1754:1: ( rule__ColorCondition__Group_1__1__Impl rule__ColorCondition__Group_1__2 )
            // InternalCarpilot.g:1755:2: rule__ColorCondition__Group_1__1__Impl rule__ColorCondition__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__ColorCondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_1__2();

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
    // $ANTLR end "rule__ColorCondition__Group_1__1"


    // $ANTLR start "rule__ColorCondition__Group_1__1__Impl"
    // InternalCarpilot.g:1762:1: rule__ColorCondition__Group_1__1__Impl : ( '==' ) ;
    public final void rule__ColorCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1766:1: ( ( '==' ) )
            // InternalCarpilot.g:1767:1: ( '==' )
            {
            // InternalCarpilot.g:1767:1: ( '==' )
            // InternalCarpilot.g:1768:2: '=='
            {
             before(grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__ColorCondition__Group_1__1__Impl"


    // $ANTLR start "rule__ColorCondition__Group_1__2"
    // InternalCarpilot.g:1777:1: rule__ColorCondition__Group_1__2 : rule__ColorCondition__Group_1__2__Impl ;
    public final void rule__ColorCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1781:1: ( rule__ColorCondition__Group_1__2__Impl )
            // InternalCarpilot.g:1782:2: rule__ColorCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__ColorCondition__Group_1__2"


    // $ANTLR start "rule__ColorCondition__Group_1__2__Impl"
    // InternalCarpilot.g:1788:1: rule__ColorCondition__Group_1__2__Impl : ( ( rule__ColorCondition__ColorAssignment_1_2 ) ) ;
    public final void rule__ColorCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1792:1: ( ( ( rule__ColorCondition__ColorAssignment_1_2 ) ) )
            // InternalCarpilot.g:1793:1: ( ( rule__ColorCondition__ColorAssignment_1_2 ) )
            {
            // InternalCarpilot.g:1793:1: ( ( rule__ColorCondition__ColorAssignment_1_2 ) )
            // InternalCarpilot.g:1794:2: ( rule__ColorCondition__ColorAssignment_1_2 )
            {
             before(grammarAccess.getColorConditionAccess().getColorAssignment_1_2()); 
            // InternalCarpilot.g:1795:2: ( rule__ColorCondition__ColorAssignment_1_2 )
            // InternalCarpilot.g:1795:3: rule__ColorCondition__ColorAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ColorCondition__ColorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getColorConditionAccess().getColorAssignment_1_2()); 

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
    // $ANTLR end "rule__ColorCondition__Group_1__2__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__0"
    // InternalCarpilot.g:1804:1: rule__DistanceCondition__Group__0 : rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 ;
    public final void rule__DistanceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1808:1: ( rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1 )
            // InternalCarpilot.g:1809:2: rule__DistanceCondition__Group__0__Impl rule__DistanceCondition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DistanceCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__1();

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
    // $ANTLR end "rule__DistanceCondition__Group__0"


    // $ANTLR start "rule__DistanceCondition__Group__0__Impl"
    // InternalCarpilot.g:1816:1: rule__DistanceCondition__Group__0__Impl : ( ( rule__DistanceCondition__SensorAssignment_0 ) ) ;
    public final void rule__DistanceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1820:1: ( ( ( rule__DistanceCondition__SensorAssignment_0 ) ) )
            // InternalCarpilot.g:1821:1: ( ( rule__DistanceCondition__SensorAssignment_0 ) )
            {
            // InternalCarpilot.g:1821:1: ( ( rule__DistanceCondition__SensorAssignment_0 ) )
            // InternalCarpilot.g:1822:2: ( rule__DistanceCondition__SensorAssignment_0 )
            {
             before(grammarAccess.getDistanceConditionAccess().getSensorAssignment_0()); 
            // InternalCarpilot.g:1823:2: ( rule__DistanceCondition__SensorAssignment_0 )
            // InternalCarpilot.g:1823:3: rule__DistanceCondition__SensorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__SensorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getSensorAssignment_0()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__0__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__1"
    // InternalCarpilot.g:1831:1: rule__DistanceCondition__Group__1 : rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 ;
    public final void rule__DistanceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1835:1: ( rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2 )
            // InternalCarpilot.g:1836:2: rule__DistanceCondition__Group__1__Impl rule__DistanceCondition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DistanceCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__2();

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
    // $ANTLR end "rule__DistanceCondition__Group__1"


    // $ANTLR start "rule__DistanceCondition__Group__1__Impl"
    // InternalCarpilot.g:1843:1: rule__DistanceCondition__Group__1__Impl : ( ( rule__DistanceCondition__OperatorAssignment_1 ) ) ;
    public final void rule__DistanceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1847:1: ( ( ( rule__DistanceCondition__OperatorAssignment_1 ) ) )
            // InternalCarpilot.g:1848:1: ( ( rule__DistanceCondition__OperatorAssignment_1 ) )
            {
            // InternalCarpilot.g:1848:1: ( ( rule__DistanceCondition__OperatorAssignment_1 ) )
            // InternalCarpilot.g:1849:2: ( rule__DistanceCondition__OperatorAssignment_1 )
            {
             before(grammarAccess.getDistanceConditionAccess().getOperatorAssignment_1()); 
            // InternalCarpilot.g:1850:2: ( rule__DistanceCondition__OperatorAssignment_1 )
            // InternalCarpilot.g:1850:3: rule__DistanceCondition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__1__Impl"


    // $ANTLR start "rule__DistanceCondition__Group__2"
    // InternalCarpilot.g:1858:1: rule__DistanceCondition__Group__2 : rule__DistanceCondition__Group__2__Impl ;
    public final void rule__DistanceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1862:1: ( rule__DistanceCondition__Group__2__Impl )
            // InternalCarpilot.g:1863:2: rule__DistanceCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__Group__2__Impl();

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
    // $ANTLR end "rule__DistanceCondition__Group__2"


    // $ANTLR start "rule__DistanceCondition__Group__2__Impl"
    // InternalCarpilot.g:1869:1: rule__DistanceCondition__Group__2__Impl : ( ( rule__DistanceCondition__DistanceAssignment_2 ) ) ;
    public final void rule__DistanceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1873:1: ( ( ( rule__DistanceCondition__DistanceAssignment_2 ) ) )
            // InternalCarpilot.g:1874:1: ( ( rule__DistanceCondition__DistanceAssignment_2 ) )
            {
            // InternalCarpilot.g:1874:1: ( ( rule__DistanceCondition__DistanceAssignment_2 ) )
            // InternalCarpilot.g:1875:2: ( rule__DistanceCondition__DistanceAssignment_2 )
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_2()); 
            // InternalCarpilot.g:1876:2: ( rule__DistanceCondition__DistanceAssignment_2 )
            // InternalCarpilot.g:1876:3: rule__DistanceCondition__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceCondition__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceConditionAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__DistanceCondition__Group__2__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalCarpilot.g:1885:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1889:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalCarpilot.g:1890:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

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
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalCarpilot.g:1897:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1901:1: ( ( RULE_INT ) )
            // InternalCarpilot.g:1902:1: ( RULE_INT )
            {
            // InternalCarpilot.g:1902:1: ( RULE_INT )
            // InternalCarpilot.g:1903:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalCarpilot.g:1912:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1916:1: ( rule__Float__Group__1__Impl )
            // InternalCarpilot.g:1917:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

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
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalCarpilot.g:1923:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1927:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalCarpilot.g:1928:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalCarpilot.g:1928:1: ( ( rule__Float__Group_1__0 )? )
            // InternalCarpilot.g:1929:2: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalCarpilot.g:1930:2: ( rule__Float__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCarpilot.g:1930:3: rule__Float__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group_1__0"
    // InternalCarpilot.g:1939:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1943:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalCarpilot.g:1944:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Float__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1();

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
    // $ANTLR end "rule__Float__Group_1__0"


    // $ANTLR start "rule__Float__Group_1__0__Impl"
    // InternalCarpilot.g:1951:1: rule__Float__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1955:1: ( ( '.' ) )
            // InternalCarpilot.g:1956:1: ( '.' )
            {
            // InternalCarpilot.g:1956:1: ( '.' )
            // InternalCarpilot.g:1957:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Float__Group_1__0__Impl"


    // $ANTLR start "rule__Float__Group_1__1"
    // InternalCarpilot.g:1966:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1970:1: ( rule__Float__Group_1__1__Impl )
            // InternalCarpilot.g:1971:2: rule__Float__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1__Impl();

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
    // $ANTLR end "rule__Float__Group_1__1"


    // $ANTLR start "rule__Float__Group_1__1__Impl"
    // InternalCarpilot.g:1977:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1981:1: ( ( RULE_INT ) )
            // InternalCarpilot.g:1982:1: ( RULE_INT )
            {
            // InternalCarpilot.g:1982:1: ( RULE_INT )
            // InternalCarpilot.g:1983:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Float__Group_1__1__Impl"


    // $ANTLR start "rule__Car__NameAssignment_0_1"
    // InternalCarpilot.g:1993:1: rule__Car__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__Car__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:1997:1: ( ( ruleEString ) )
            // InternalCarpilot.g:1998:2: ( ruleEString )
            {
            // InternalCarpilot.g:1998:2: ( ruleEString )
            // InternalCarpilot.g:1999:3: ruleEString
            {
             before(grammarAccess.getCarAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCarAccess().getNameEStringParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Car__NameAssignment_0_1"


    // $ANTLR start "rule__Car__RulesAssignment_1_1"
    // InternalCarpilot.g:2008:1: rule__Car__RulesAssignment_1_1 : ( ruleRule ) ;
    public final void rule__Car__RulesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2012:1: ( ( ruleRule ) )
            // InternalCarpilot.g:2013:2: ( ruleRule )
            {
            // InternalCarpilot.g:2013:2: ( ruleRule )
            // InternalCarpilot.g:2014:3: ruleRule
            {
             before(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Car__RulesAssignment_1_1"


    // $ANTLR start "rule__Car__RulesAssignment_1_2_1"
    // InternalCarpilot.g:2023:1: rule__Car__RulesAssignment_1_2_1 : ( ruleRule ) ;
    public final void rule__Car__RulesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2027:1: ( ( ruleRule ) )
            // InternalCarpilot.g:2028:2: ( ruleRule )
            {
            // InternalCarpilot.g:2028:2: ( ruleRule )
            // InternalCarpilot.g:2029:3: ruleRule
            {
             before(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__Car__RulesAssignment_1_2_1"


    // $ANTLR start "rule__Car__OrdersAssignment_4"
    // InternalCarpilot.g:2038:1: rule__Car__OrdersAssignment_4 : ( ruleCommand ) ;
    public final void rule__Car__OrdersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2042:1: ( ( ruleCommand ) )
            // InternalCarpilot.g:2043:2: ( ruleCommand )
            {
            // InternalCarpilot.g:2043:2: ( ruleCommand )
            // InternalCarpilot.g:2044:3: ruleCommand
            {
             before(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Car__OrdersAssignment_4"


    // $ANTLR start "rule__Car__OrdersAssignment_5_1"
    // InternalCarpilot.g:2053:1: rule__Car__OrdersAssignment_5_1 : ( ruleCommand ) ;
    public final void rule__Car__OrdersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2057:1: ( ( ruleCommand ) )
            // InternalCarpilot.g:2058:2: ( ruleCommand )
            {
            // InternalCarpilot.g:2058:2: ( ruleCommand )
            // InternalCarpilot.g:2059:3: ruleCommand
            {
             before(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Car__OrdersAssignment_5_1"


    // $ANTLR start "rule__DirectRule__ConditionAssignment_0"
    // InternalCarpilot.g:2068:1: rule__DirectRule__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__DirectRule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2072:1: ( ( ruleCondition ) )
            // InternalCarpilot.g:2073:2: ( ruleCondition )
            {
            // InternalCarpilot.g:2073:2: ( ruleCondition )
            // InternalCarpilot.g:2074:3: ruleCondition
            {
             before(grammarAccess.getDirectRuleAccess().getConditionConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getDirectRuleAccess().getConditionConditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DirectRule__ConditionAssignment_0"


    // $ANTLR start "rule__DirectRule__EffectAssignment_2"
    // InternalCarpilot.g:2083:1: rule__DirectRule__EffectAssignment_2 : ( ruleRuleEffect ) ;
    public final void rule__DirectRule__EffectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2087:1: ( ( ruleRuleEffect ) )
            // InternalCarpilot.g:2088:2: ( ruleRuleEffect )
            {
            // InternalCarpilot.g:2088:2: ( ruleRuleEffect )
            // InternalCarpilot.g:2089:3: ruleRuleEffect
            {
             before(grammarAccess.getDirectRuleAccess().getEffectRuleEffectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleEffect();

            state._fsp--;

             after(grammarAccess.getDirectRuleAccess().getEffectRuleEffectParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DirectRule__EffectAssignment_2"


    // $ANTLR start "rule__PersistingRule__ConditionAssignment_0"
    // InternalCarpilot.g:2098:1: rule__PersistingRule__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__PersistingRule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2102:1: ( ( ruleCondition ) )
            // InternalCarpilot.g:2103:2: ( ruleCondition )
            {
            // InternalCarpilot.g:2103:2: ( ruleCondition )
            // InternalCarpilot.g:2104:3: ruleCondition
            {
             before(grammarAccess.getPersistingRuleAccess().getConditionConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersistingRuleAccess().getConditionConditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PersistingRule__ConditionAssignment_0"


    // $ANTLR start "rule__PersistingRule__EffectAssignment_2"
    // InternalCarpilot.g:2113:1: rule__PersistingRule__EffectAssignment_2 : ( ruleRuleEffect ) ;
    public final void rule__PersistingRule__EffectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2117:1: ( ( ruleRuleEffect ) )
            // InternalCarpilot.g:2118:2: ( ruleRuleEffect )
            {
            // InternalCarpilot.g:2118:2: ( ruleRuleEffect )
            // InternalCarpilot.g:2119:3: ruleRuleEffect
            {
             before(grammarAccess.getPersistingRuleAccess().getEffectRuleEffectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleEffect();

            state._fsp--;

             after(grammarAccess.getPersistingRuleAccess().getEffectRuleEffectParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PersistingRule__EffectAssignment_2"


    // $ANTLR start "rule__PersistingRule__StopAssignment_4"
    // InternalCarpilot.g:2128:1: rule__PersistingRule__StopAssignment_4 : ( ruleCondition ) ;
    public final void rule__PersistingRule__StopAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2132:1: ( ( ruleCondition ) )
            // InternalCarpilot.g:2133:2: ( ruleCondition )
            {
            // InternalCarpilot.g:2133:2: ( ruleCondition )
            // InternalCarpilot.g:2134:3: ruleCondition
            {
             before(grammarAccess.getPersistingRuleAccess().getStopConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPersistingRuleAccess().getStopConditionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PersistingRule__StopAssignment_4"


    // $ANTLR start "rule__CommandEffect__CommandAssignment"
    // InternalCarpilot.g:2143:1: rule__CommandEffect__CommandAssignment : ( ruleCommand ) ;
    public final void rule__CommandEffect__CommandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2147:1: ( ( ruleCommand ) )
            // InternalCarpilot.g:2148:2: ( ruleCommand )
            {
            // InternalCarpilot.g:2148:2: ( ruleCommand )
            // InternalCarpilot.g:2149:3: ruleCommand
            {
             before(grammarAccess.getCommandEffectAccess().getCommandCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandEffectAccess().getCommandCommandParserRuleCall_0()); 

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
    // $ANTLR end "rule__CommandEffect__CommandAssignment"


    // $ANTLR start "rule__AbilityEffect__DisableAssignment_1"
    // InternalCarpilot.g:2158:1: rule__AbilityEffect__DisableAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__AbilityEffect__DisableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2162:1: ( ( ( 'not' ) ) )
            // InternalCarpilot.g:2163:2: ( ( 'not' ) )
            {
            // InternalCarpilot.g:2163:2: ( ( 'not' ) )
            // InternalCarpilot.g:2164:3: ( 'not' )
            {
             before(grammarAccess.getAbilityEffectAccess().getDisableNotKeyword_1_0()); 
            // InternalCarpilot.g:2165:3: ( 'not' )
            // InternalCarpilot.g:2166:4: 'not'
            {
             before(grammarAccess.getAbilityEffectAccess().getDisableNotKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAbilityEffectAccess().getDisableNotKeyword_1_0()); 

            }

             after(grammarAccess.getAbilityEffectAccess().getDisableNotKeyword_1_0()); 

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
    // $ANTLR end "rule__AbilityEffect__DisableAssignment_1"


    // $ANTLR start "rule__AbilityEffect__DirectionAssignment_3"
    // InternalCarpilot.g:2177:1: rule__AbilityEffect__DirectionAssignment_3 : ( ruleDirection ) ;
    public final void rule__AbilityEffect__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2181:1: ( ( ruleDirection ) )
            // InternalCarpilot.g:2182:2: ( ruleDirection )
            {
            // InternalCarpilot.g:2182:2: ( ruleDirection )
            // InternalCarpilot.g:2183:3: ruleDirection
            {
             before(grammarAccess.getAbilityEffectAccess().getDirectionDirectionEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAbilityEffectAccess().getDirectionDirectionEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__AbilityEffect__DirectionAssignment_3"


    // $ANTLR start "rule__Command__DirectionAssignment_1_1"
    // InternalCarpilot.g:2192:1: rule__Command__DirectionAssignment_1_1 : ( ruleDirection ) ;
    public final void rule__Command__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2196:1: ( ( ruleDirection ) )
            // InternalCarpilot.g:2197:2: ( ruleDirection )
            {
            // InternalCarpilot.g:2197:2: ( ruleDirection )
            // InternalCarpilot.g:2198:3: ruleDirection
            {
             before(grammarAccess.getCommandAccess().getDirectionDirectionEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getDirectionDirectionEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Command__DirectionAssignment_1_1"


    // $ANTLR start "rule__ColorCondition__ColorAssignment_0_1_0"
    // InternalCarpilot.g:2207:1: rule__ColorCondition__ColorAssignment_0_1_0 : ( ruleColor ) ;
    public final void rule__ColorCondition__ColorAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2211:1: ( ( ruleColor ) )
            // InternalCarpilot.g:2212:2: ( ruleColor )
            {
            // InternalCarpilot.g:2212:2: ( ruleColor )
            // InternalCarpilot.g:2213:3: ruleColor
            {
             before(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__ColorCondition__ColorAssignment_0_1_0"


    // $ANTLR start "rule__ColorCondition__CameraAssignment_0_1_2"
    // InternalCarpilot.g:2222:1: rule__ColorCondition__CameraAssignment_0_1_2 : ( ruleCamera ) ;
    public final void rule__ColorCondition__CameraAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2226:1: ( ( ruleCamera ) )
            // InternalCarpilot.g:2227:2: ( ruleCamera )
            {
            // InternalCarpilot.g:2227:2: ( ruleCamera )
            // InternalCarpilot.g:2228:3: ruleCamera
            {
             before(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCamera();

            state._fsp--;

             after(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__ColorCondition__CameraAssignment_0_1_2"


    // $ANTLR start "rule__ColorCondition__CameraAssignment_1_0"
    // InternalCarpilot.g:2237:1: rule__ColorCondition__CameraAssignment_1_0 : ( ruleCamera ) ;
    public final void rule__ColorCondition__CameraAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2241:1: ( ( ruleCamera ) )
            // InternalCarpilot.g:2242:2: ( ruleCamera )
            {
            // InternalCarpilot.g:2242:2: ( ruleCamera )
            // InternalCarpilot.g:2243:3: ruleCamera
            {
             before(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCamera();

            state._fsp--;

             after(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ColorCondition__CameraAssignment_1_0"


    // $ANTLR start "rule__ColorCondition__ColorAssignment_1_2"
    // InternalCarpilot.g:2252:1: rule__ColorCondition__ColorAssignment_1_2 : ( ruleColor ) ;
    public final void rule__ColorCondition__ColorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2256:1: ( ( ruleColor ) )
            // InternalCarpilot.g:2257:2: ( ruleColor )
            {
            // InternalCarpilot.g:2257:2: ( ruleColor )
            // InternalCarpilot.g:2258:3: ruleColor
            {
             before(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ColorCondition__ColorAssignment_1_2"


    // $ANTLR start "rule__DistanceCondition__SensorAssignment_0"
    // InternalCarpilot.g:2267:1: rule__DistanceCondition__SensorAssignment_0 : ( ruleSensor ) ;
    public final void rule__DistanceCondition__SensorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2271:1: ( ( ruleSensor ) )
            // InternalCarpilot.g:2272:2: ( ruleSensor )
            {
            // InternalCarpilot.g:2272:2: ( ruleSensor )
            // InternalCarpilot.g:2273:3: ruleSensor
            {
             before(grammarAccess.getDistanceConditionAccess().getSensorSensorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getSensorSensorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__DistanceCondition__SensorAssignment_0"


    // $ANTLR start "rule__DistanceCondition__OperatorAssignment_1"
    // InternalCarpilot.g:2282:1: rule__DistanceCondition__OperatorAssignment_1 : ( ruleAnalogOperand ) ;
    public final void rule__DistanceCondition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2286:1: ( ( ruleAnalogOperand ) )
            // InternalCarpilot.g:2287:2: ( ruleAnalogOperand )
            {
            // InternalCarpilot.g:2287:2: ( ruleAnalogOperand )
            // InternalCarpilot.g:2288:3: ruleAnalogOperand
            {
             before(grammarAccess.getDistanceConditionAccess().getOperatorAnalogOperandEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnalogOperand();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getOperatorAnalogOperandEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__DistanceCondition__OperatorAssignment_1"


    // $ANTLR start "rule__DistanceCondition__DistanceAssignment_2"
    // InternalCarpilot.g:2297:1: rule__DistanceCondition__DistanceAssignment_2 : ( ruleFloat ) ;
    public final void rule__DistanceCondition__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCarpilot.g:2301:1: ( ( ruleFloat ) )
            // InternalCarpilot.g:2302:2: ( ruleFloat )
            {
            // InternalCarpilot.g:2302:2: ( ruleFloat )
            // InternalCarpilot.g:2303:3: ruleFloat
            {
             before(grammarAccess.getDistanceConditionAccess().getDistanceFloatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getDistanceConditionAccess().getDistanceFloatParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DistanceCondition__DistanceAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\65\uffff";
    static final String dfa_2s = "\42\uffff\1\54\2\uffff\5\54\6\uffff\5\54";
    static final String dfa_3s = "\1\20\16\13\1\26\1\20\5\6\14\45\1\30\1\6\1\30\5\41\1\uffff\1\50\1\uffff\1\45\1\50\1\30\5\41";
    static final String dfa_4s = "\1\40\13\13\3\17\1\32\1\25\5\6\13\45\1\51\1\50\1\6\1\35\5\46\1\uffff\1\52\1\uffff\1\45\1\50\1\35\5\46";
    static final String dfa_5s = "\52\uffff\1\1\1\uffff\1\2\10\uffff";
    static final String dfa_6s = "\65\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff\1\14\1\15\1\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\21\1\22\1\23\1\24\1\25",
            "\1\21\1\22\1\23\1\24\1\25",
            "\1\21\1\22\1\23\1\24\1\25",
            "\1\26\1\27\1\30\1\31\1\32",
            "\1\33\1\34\1\35\1\36\1\37\1\40",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42\3\uffff\1\43",
            "\1\46\1\47\1\uffff\1\45\1\50\1\51\3\uffff\2\54\3\uffff\1\52\1\53\1\44",
            "\1\55",
            "\1\46\1\47\1\uffff\1\45\1\50\1\51",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "",
            "\1\57\1\uffff\1\56",
            "",
            "\1\42",
            "\1\57",
            "\1\61\1\62\1\uffff\1\60\1\63\1\64",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52",
            "\2\54\3\uffff\1\52"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "499:1: rule__Rule__Alternatives : ( ( rulePersistingRule ) | ( ruleDirectRule ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000001003B000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C7FF0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001803B000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007FF0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});

}