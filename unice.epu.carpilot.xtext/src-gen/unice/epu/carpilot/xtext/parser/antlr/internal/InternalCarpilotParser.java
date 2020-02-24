package unice.epu.carpilot.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import unice.epu.carpilot.xtext.services.CarpilotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCarpilotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'named'", "'rules:\\n'", "'\\n'", "'orders:'", "'->'", "'until'", "'can'", "'not'", "'go'", "'=='", "'.'", "'>'", "'<'", "'>='", "'<='", "'red'", "'blue'", "'orange'", "'black'", "'white'", "'building'", "'very right'", "'very left'", "'left'", "'right'", "'center'", "'forward'", "'backward'", "'stop'", "'distance left'", "'distance right'", "'front'"
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

        public InternalCarpilotParser(TokenStream input, CarpilotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Car";
       	}

       	@Override
       	protected CarpilotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCar"
    // InternalCarpilot.g:65:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalCarpilot.g:65:44: (iv_ruleCar= ruleCar EOF )
            // InternalCarpilot.g:66:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalCarpilot.g:72:1: ruleCar returns [EObject current=null] : ( (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )? (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= 'orders:' otherlv_7= '\\n' ( (lv_orders_8_0= ruleCommand ) ) (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rules_3_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_orders_8_0 = null;

        EObject lv_orders_10_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:78:2: ( ( (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )? (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= 'orders:' otherlv_7= '\\n' ( (lv_orders_8_0= ruleCommand ) ) (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )* ) )
            // InternalCarpilot.g:79:2: ( (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )? (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= 'orders:' otherlv_7= '\\n' ( (lv_orders_8_0= ruleCommand ) ) (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )* )
            {
            // InternalCarpilot.g:79:2: ( (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )? (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= 'orders:' otherlv_7= '\\n' ( (lv_orders_8_0= ruleCommand ) ) (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )* )
            // InternalCarpilot.g:80:3: (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )? (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )? otherlv_6= 'orders:' otherlv_7= '\\n' ( (lv_orders_8_0= ruleCommand ) ) (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )*
            {
            // InternalCarpilot.g:80:3: (otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCarpilot.g:81:4: otherlv_0= 'named' ( (lv_name_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getCarAccess().getNamedKeyword_0_0());
                    			
                    // InternalCarpilot.g:85:4: ( (lv_name_1_0= ruleEString ) )
                    // InternalCarpilot.g:86:5: (lv_name_1_0= ruleEString )
                    {
                    // InternalCarpilot.g:86:5: (lv_name_1_0= ruleEString )
                    // InternalCarpilot.g:87:6: lv_name_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCarAccess().getNameEStringParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCarRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"unice.epu.carpilot.xtext.Carpilot.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCarpilot.g:105:3: (otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCarpilot.g:106:4: otherlv_2= 'rules:\\n' ( (lv_rules_3_0= ruleRule ) ) (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )*
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCarAccess().getRulesKeyword_1_0());
                    			
                    // InternalCarpilot.g:110:4: ( (lv_rules_3_0= ruleRule ) )
                    // InternalCarpilot.g:111:5: (lv_rules_3_0= ruleRule )
                    {
                    // InternalCarpilot.g:111:5: (lv_rules_3_0= ruleRule )
                    // InternalCarpilot.g:112:6: lv_rules_3_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_rules_3_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCarRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_3_0,
                    							"unice.epu.carpilot.xtext.Carpilot.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCarpilot.g:129:4: (otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCarpilot.g:130:5: otherlv_4= '\\n' ( (lv_rules_5_0= ruleRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCarAccess().getLineFeedKeyword_1_2_0());
                    	    				
                    	    // InternalCarpilot.g:134:5: ( (lv_rules_5_0= ruleRule ) )
                    	    // InternalCarpilot.g:135:6: (lv_rules_5_0= ruleRule )
                    	    {
                    	    // InternalCarpilot.g:135:6: (lv_rules_5_0= ruleRule )
                    	    // InternalCarpilot.g:136:7: lv_rules_5_0= ruleRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getCarAccess().getRulesRuleParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_rules_5_0=ruleRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCarRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rules",
                    	    								lv_rules_5_0,
                    	    								"unice.epu.carpilot.xtext.Carpilot.Rule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCarAccess().getOrdersKeyword_2());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCarAccess().getLineFeedKeyword_3());
            		
            // InternalCarpilot.g:163:3: ( (lv_orders_8_0= ruleCommand ) )
            // InternalCarpilot.g:164:4: (lv_orders_8_0= ruleCommand )
            {
            // InternalCarpilot.g:164:4: (lv_orders_8_0= ruleCommand )
            // InternalCarpilot.g:165:5: lv_orders_8_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_orders_8_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					add(
            						current,
            						"orders",
            						lv_orders_8_0,
            						"unice.epu.carpilot.xtext.Carpilot.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCarpilot.g:182:3: (otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCarpilot.g:183:4: otherlv_9= '\\n' ( (lv_orders_10_0= ruleCommand ) )
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCarAccess().getLineFeedKeyword_5_0());
            	    			
            	    // InternalCarpilot.g:187:4: ( (lv_orders_10_0= ruleCommand ) )
            	    // InternalCarpilot.g:188:5: (lv_orders_10_0= ruleCommand )
            	    {
            	    // InternalCarpilot.g:188:5: (lv_orders_10_0= ruleCommand )
            	    // InternalCarpilot.g:189:6: lv_orders_10_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getCarAccess().getOrdersCommandParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_orders_10_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCarRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orders",
            	    							lv_orders_10_0,
            	    							"unice.epu.carpilot.xtext.Carpilot.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleCondition"
    // InternalCarpilot.g:211:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCarpilot.g:211:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCarpilot.g:212:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCarpilot.g:218:1: ruleCondition returns [EObject current=null] : (this_ColorCondition_0= ruleColorCondition | this_DistanceCondition_1= ruleDistanceCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ColorCondition_0 = null;

        EObject this_DistanceCondition_1 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:224:2: ( (this_ColorCondition_0= ruleColorCondition | this_DistanceCondition_1= ruleDistanceCondition ) )
            // InternalCarpilot.g:225:2: (this_ColorCondition_0= ruleColorCondition | this_DistanceCondition_1= ruleDistanceCondition )
            {
            // InternalCarpilot.g:225:2: (this_ColorCondition_0= ruleColorCondition | this_DistanceCondition_1= ruleDistanceCondition )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=36)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=40 && LA5_0<=42)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCarpilot.g:226:3: this_ColorCondition_0= ruleColorCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getColorConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorCondition_0=ruleColorCondition();

                    state._fsp--;


                    			current = this_ColorCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:235:3: this_DistanceCondition_1= ruleDistanceCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getDistanceConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceCondition_1=ruleDistanceCondition();

                    state._fsp--;


                    			current = this_DistanceCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEString"
    // InternalCarpilot.g:247:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCarpilot.g:247:47: (iv_ruleEString= ruleEString EOF )
            // InternalCarpilot.g:248:2: iv_ruleEString= ruleEString EOF
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
    // InternalCarpilot.g:254:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCarpilot.g:260:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCarpilot.g:261:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCarpilot.g:261:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCarpilot.g:262:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:270:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRule"
    // InternalCarpilot.g:281:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCarpilot.g:281:45: (iv_ruleRule= ruleRule EOF )
            // InternalCarpilot.g:282:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCarpilot.g:288:1: ruleRule returns [EObject current=null] : (this_PersistingRule_0= rulePersistingRule | this_DirectRule_1= ruleDirectRule ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_PersistingRule_0 = null;

        EObject this_DirectRule_1 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:294:2: ( (this_PersistingRule_0= rulePersistingRule | this_DirectRule_1= ruleDirectRule ) )
            // InternalCarpilot.g:295:2: (this_PersistingRule_0= rulePersistingRule | this_DirectRule_1= ruleDirectRule )
            {
            // InternalCarpilot.g:295:2: (this_PersistingRule_0= rulePersistingRule | this_DirectRule_1= ruleDirectRule )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCarpilot.g:296:3: this_PersistingRule_0= rulePersistingRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getPersistingRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PersistingRule_0=rulePersistingRule();

                    state._fsp--;


                    			current = this_PersistingRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:305:3: this_DirectRule_1= ruleDirectRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getDirectRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirectRule_1=ruleDirectRule();

                    state._fsp--;


                    			current = this_DirectRule_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleDirectRule"
    // InternalCarpilot.g:317:1: entryRuleDirectRule returns [EObject current=null] : iv_ruleDirectRule= ruleDirectRule EOF ;
    public final EObject entryRuleDirectRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectRule = null;


        try {
            // InternalCarpilot.g:317:51: (iv_ruleDirectRule= ruleDirectRule EOF )
            // InternalCarpilot.g:318:2: iv_ruleDirectRule= ruleDirectRule EOF
            {
             newCompositeNode(grammarAccess.getDirectRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectRule=ruleDirectRule();

            state._fsp--;

             current =iv_ruleDirectRule; 
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
    // $ANTLR end "entryRuleDirectRule"


    // $ANTLR start "ruleDirectRule"
    // InternalCarpilot.g:324:1: ruleDirectRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) ) ;
    public final EObject ruleDirectRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_effect_2_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:330:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) ) )
            // InternalCarpilot.g:331:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) )
            {
            // InternalCarpilot.g:331:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) )
            // InternalCarpilot.g:332:3: ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) )
            {
            // InternalCarpilot.g:332:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalCarpilot.g:333:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalCarpilot.g:333:4: (lv_condition_0_0= ruleCondition )
            // InternalCarpilot.g:334:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDirectRuleAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"unice.epu.carpilot.xtext.Carpilot.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCarpilot.g:355:3: ( (lv_effect_2_0= ruleRuleEffect ) )
            // InternalCarpilot.g:356:4: (lv_effect_2_0= ruleRuleEffect )
            {
            // InternalCarpilot.g:356:4: (lv_effect_2_0= ruleRuleEffect )
            // InternalCarpilot.g:357:5: lv_effect_2_0= ruleRuleEffect
            {

            					newCompositeNode(grammarAccess.getDirectRuleAccess().getEffectRuleEffectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_effect_2_0=ruleRuleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirectRuleRule());
            					}
            					set(
            						current,
            						"effect",
            						lv_effect_2_0,
            						"unice.epu.carpilot.xtext.Carpilot.RuleEffect");
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
    // $ANTLR end "ruleDirectRule"


    // $ANTLR start "entryRulePersistingRule"
    // InternalCarpilot.g:378:1: entryRulePersistingRule returns [EObject current=null] : iv_rulePersistingRule= rulePersistingRule EOF ;
    public final EObject entryRulePersistingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistingRule = null;


        try {
            // InternalCarpilot.g:378:55: (iv_rulePersistingRule= rulePersistingRule EOF )
            // InternalCarpilot.g:379:2: iv_rulePersistingRule= rulePersistingRule EOF
            {
             newCompositeNode(grammarAccess.getPersistingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersistingRule=rulePersistingRule();

            state._fsp--;

             current =iv_rulePersistingRule; 
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
    // $ANTLR end "entryRulePersistingRule"


    // $ANTLR start "rulePersistingRule"
    // InternalCarpilot.g:385:1: rulePersistingRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) otherlv_3= 'until' ( (lv_stop_4_0= ruleCondition ) ) ) ;
    public final EObject rulePersistingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_effect_2_0 = null;

        EObject lv_stop_4_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:391:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) otherlv_3= 'until' ( (lv_stop_4_0= ruleCondition ) ) ) )
            // InternalCarpilot.g:392:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) otherlv_3= 'until' ( (lv_stop_4_0= ruleCondition ) ) )
            {
            // InternalCarpilot.g:392:2: ( ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) otherlv_3= 'until' ( (lv_stop_4_0= ruleCondition ) ) )
            // InternalCarpilot.g:393:3: ( (lv_condition_0_0= ruleCondition ) ) otherlv_1= '->' ( (lv_effect_2_0= ruleRuleEffect ) ) otherlv_3= 'until' ( (lv_stop_4_0= ruleCondition ) )
            {
            // InternalCarpilot.g:393:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalCarpilot.g:394:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalCarpilot.g:394:4: (lv_condition_0_0= ruleCondition )
            // InternalCarpilot.g:395:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPersistingRuleAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersistingRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"unice.epu.carpilot.xtext.Carpilot.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPersistingRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCarpilot.g:416:3: ( (lv_effect_2_0= ruleRuleEffect ) )
            // InternalCarpilot.g:417:4: (lv_effect_2_0= ruleRuleEffect )
            {
            // InternalCarpilot.g:417:4: (lv_effect_2_0= ruleRuleEffect )
            // InternalCarpilot.g:418:5: lv_effect_2_0= ruleRuleEffect
            {

            					newCompositeNode(grammarAccess.getPersistingRuleAccess().getEffectRuleEffectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_effect_2_0=ruleRuleEffect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersistingRuleRule());
            					}
            					set(
            						current,
            						"effect",
            						lv_effect_2_0,
            						"unice.epu.carpilot.xtext.Carpilot.RuleEffect");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPersistingRuleAccess().getUntilKeyword_3());
            		
            // InternalCarpilot.g:439:3: ( (lv_stop_4_0= ruleCondition ) )
            // InternalCarpilot.g:440:4: (lv_stop_4_0= ruleCondition )
            {
            // InternalCarpilot.g:440:4: (lv_stop_4_0= ruleCondition )
            // InternalCarpilot.g:441:5: lv_stop_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPersistingRuleAccess().getStopConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_stop_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersistingRuleRule());
            					}
            					set(
            						current,
            						"stop",
            						lv_stop_4_0,
            						"unice.epu.carpilot.xtext.Carpilot.Condition");
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
    // $ANTLR end "rulePersistingRule"


    // $ANTLR start "entryRuleRuleEffect"
    // InternalCarpilot.g:462:1: entryRuleRuleEffect returns [EObject current=null] : iv_ruleRuleEffect= ruleRuleEffect EOF ;
    public final EObject entryRuleRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleEffect = null;


        try {
            // InternalCarpilot.g:462:51: (iv_ruleRuleEffect= ruleRuleEffect EOF )
            // InternalCarpilot.g:463:2: iv_ruleRuleEffect= ruleRuleEffect EOF
            {
             newCompositeNode(grammarAccess.getRuleEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleEffect=ruleRuleEffect();

            state._fsp--;

             current =iv_ruleRuleEffect; 
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
    // $ANTLR end "entryRuleRuleEffect"


    // $ANTLR start "ruleRuleEffect"
    // InternalCarpilot.g:469:1: ruleRuleEffect returns [EObject current=null] : (this_CommandEffect_0= ruleCommandEffect | this_AbilityEffect_1= ruleAbilityEffect ) ;
    public final EObject ruleRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_CommandEffect_0 = null;

        EObject this_AbilityEffect_1 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:475:2: ( (this_CommandEffect_0= ruleCommandEffect | this_AbilityEffect_1= ruleAbilityEffect ) )
            // InternalCarpilot.g:476:2: (this_CommandEffect_0= ruleCommandEffect | this_AbilityEffect_1= ruleAbilityEffect )
            {
            // InternalCarpilot.g:476:2: (this_CommandEffect_0= ruleCommandEffect | this_AbilityEffect_1= ruleAbilityEffect )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||(LA8_0>=13 && LA8_0<=14)||LA8_0==16||LA8_0==19||(LA8_0>=34 && LA8_0<=35)||(LA8_0>=37 && LA8_0<=39)) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCarpilot.g:477:3: this_CommandEffect_0= ruleCommandEffect
                    {

                    			newCompositeNode(grammarAccess.getRuleEffectAccess().getCommandEffectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandEffect_0=ruleCommandEffect();

                    state._fsp--;


                    			current = this_CommandEffect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:486:3: this_AbilityEffect_1= ruleAbilityEffect
                    {

                    			newCompositeNode(grammarAccess.getRuleEffectAccess().getAbilityEffectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbilityEffect_1=ruleAbilityEffect();

                    state._fsp--;


                    			current = this_AbilityEffect_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRuleEffect"


    // $ANTLR start "entryRuleCommandEffect"
    // InternalCarpilot.g:498:1: entryRuleCommandEffect returns [EObject current=null] : iv_ruleCommandEffect= ruleCommandEffect EOF ;
    public final EObject entryRuleCommandEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandEffect = null;


        try {
            // InternalCarpilot.g:498:54: (iv_ruleCommandEffect= ruleCommandEffect EOF )
            // InternalCarpilot.g:499:2: iv_ruleCommandEffect= ruleCommandEffect EOF
            {
             newCompositeNode(grammarAccess.getCommandEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandEffect=ruleCommandEffect();

            state._fsp--;

             current =iv_ruleCommandEffect; 
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
    // $ANTLR end "entryRuleCommandEffect"


    // $ANTLR start "ruleCommandEffect"
    // InternalCarpilot.g:505:1: ruleCommandEffect returns [EObject current=null] : ( (lv_command_0_0= ruleCommand ) ) ;
    public final EObject ruleCommandEffect() throws RecognitionException {
        EObject current = null;

        EObject lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:511:2: ( ( (lv_command_0_0= ruleCommand ) ) )
            // InternalCarpilot.g:512:2: ( (lv_command_0_0= ruleCommand ) )
            {
            // InternalCarpilot.g:512:2: ( (lv_command_0_0= ruleCommand ) )
            // InternalCarpilot.g:513:3: (lv_command_0_0= ruleCommand )
            {
            // InternalCarpilot.g:513:3: (lv_command_0_0= ruleCommand )
            // InternalCarpilot.g:514:4: lv_command_0_0= ruleCommand
            {

            				newCompositeNode(grammarAccess.getCommandEffectAccess().getCommandCommandParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_command_0_0=ruleCommand();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getCommandEffectRule());
            				}
            				set(
            					current,
            					"command",
            					lv_command_0_0,
            					"unice.epu.carpilot.xtext.Carpilot.Command");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleCommandEffect"


    // $ANTLR start "entryRuleAbilityEffect"
    // InternalCarpilot.g:534:1: entryRuleAbilityEffect returns [EObject current=null] : iv_ruleAbilityEffect= ruleAbilityEffect EOF ;
    public final EObject entryRuleAbilityEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbilityEffect = null;


        try {
            // InternalCarpilot.g:534:54: (iv_ruleAbilityEffect= ruleAbilityEffect EOF )
            // InternalCarpilot.g:535:2: iv_ruleAbilityEffect= ruleAbilityEffect EOF
            {
             newCompositeNode(grammarAccess.getAbilityEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbilityEffect=ruleAbilityEffect();

            state._fsp--;

             current =iv_ruleAbilityEffect; 
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
    // $ANTLR end "entryRuleAbilityEffect"


    // $ANTLR start "ruleAbilityEffect"
    // InternalCarpilot.g:541:1: ruleAbilityEffect returns [EObject current=null] : (otherlv_0= 'can' ( (lv_disable_1_0= 'not' ) )? otherlv_2= 'go' ( (lv_direction_3_0= ruleDirection ) ) ) ;
    public final EObject ruleAbilityEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_disable_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_direction_3_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:547:2: ( (otherlv_0= 'can' ( (lv_disable_1_0= 'not' ) )? otherlv_2= 'go' ( (lv_direction_3_0= ruleDirection ) ) ) )
            // InternalCarpilot.g:548:2: (otherlv_0= 'can' ( (lv_disable_1_0= 'not' ) )? otherlv_2= 'go' ( (lv_direction_3_0= ruleDirection ) ) )
            {
            // InternalCarpilot.g:548:2: (otherlv_0= 'can' ( (lv_disable_1_0= 'not' ) )? otherlv_2= 'go' ( (lv_direction_3_0= ruleDirection ) ) )
            // InternalCarpilot.g:549:3: otherlv_0= 'can' ( (lv_disable_1_0= 'not' ) )? otherlv_2= 'go' ( (lv_direction_3_0= ruleDirection ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAbilityEffectAccess().getCanKeyword_0());
            		
            // InternalCarpilot.g:553:3: ( (lv_disable_1_0= 'not' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCarpilot.g:554:4: (lv_disable_1_0= 'not' )
                    {
                    // InternalCarpilot.g:554:4: (lv_disable_1_0= 'not' )
                    // InternalCarpilot.g:555:5: lv_disable_1_0= 'not'
                    {
                    lv_disable_1_0=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(lv_disable_1_0, grammarAccess.getAbilityEffectAccess().getDisableNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAbilityEffectRule());
                    					}
                    					setWithLastConsumed(current, "disable", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAbilityEffectAccess().getGoKeyword_2());
            		
            // InternalCarpilot.g:571:3: ( (lv_direction_3_0= ruleDirection ) )
            // InternalCarpilot.g:572:4: (lv_direction_3_0= ruleDirection )
            {
            // InternalCarpilot.g:572:4: (lv_direction_3_0= ruleDirection )
            // InternalCarpilot.g:573:5: lv_direction_3_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getAbilityEffectAccess().getDirectionDirectionEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_3_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbilityEffectRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_3_0,
            						"unice.epu.carpilot.xtext.Carpilot.Direction");
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
    // $ANTLR end "ruleAbilityEffect"


    // $ANTLR start "entryRuleCommand"
    // InternalCarpilot.g:594:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalCarpilot.g:594:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalCarpilot.g:595:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalCarpilot.g:601:1: ruleCommand returns [EObject current=null] : ( () ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )? ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:607:2: ( ( () ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )? ) )
            // InternalCarpilot.g:608:2: ( () ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )? )
            {
            // InternalCarpilot.g:608:2: ( () ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )? )
            // InternalCarpilot.g:609:3: () ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )?
            {
            // InternalCarpilot.g:609:3: ()
            // InternalCarpilot.g:610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommandAccess().getCommandAction_0(),
            					current);
            			

            }

            // InternalCarpilot.g:616:3: ( (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19||(LA11_0>=34 && LA11_0<=35)||(LA11_0>=37 && LA11_0<=39)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCarpilot.g:617:4: (otherlv_1= 'go' )? ( (lv_direction_2_0= ruleDirection ) )
                    {
                    // InternalCarpilot.g:617:4: (otherlv_1= 'go' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCarpilot.g:618:5: otherlv_1= 'go'
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_15); 

                            					newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getGoKeyword_1_0());
                            				

                            }
                            break;

                    }

                    // InternalCarpilot.g:623:4: ( (lv_direction_2_0= ruleDirection ) )
                    // InternalCarpilot.g:624:5: (lv_direction_2_0= ruleDirection )
                    {
                    // InternalCarpilot.g:624:5: (lv_direction_2_0= ruleDirection )
                    // InternalCarpilot.g:625:6: lv_direction_2_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getCommandAccess().getDirectionDirectionEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_2_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_2_0,
                    							"unice.epu.carpilot.xtext.Carpilot.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleColorCondition"
    // InternalCarpilot.g:647:1: entryRuleColorCondition returns [EObject current=null] : iv_ruleColorCondition= ruleColorCondition EOF ;
    public final EObject entryRuleColorCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorCondition = null;


        try {
            // InternalCarpilot.g:647:55: (iv_ruleColorCondition= ruleColorCondition EOF )
            // InternalCarpilot.g:648:2: iv_ruleColorCondition= ruleColorCondition EOF
            {
             newCompositeNode(grammarAccess.getColorConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorCondition=ruleColorCondition();

            state._fsp--;

             current =iv_ruleColorCondition; 
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
    // $ANTLR end "entryRuleColorCondition"


    // $ANTLR start "ruleColorCondition"
    // InternalCarpilot.g:654:1: ruleColorCondition returns [EObject current=null] : ( ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) ) | ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) ) ) ;
    public final EObject ruleColorCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_color_1_0 = null;

        Enumerator lv_camera_3_0 = null;

        Enumerator lv_camera_4_0 = null;

        Enumerator lv_color_6_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:660:2: ( ( ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) ) | ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) ) ) )
            // InternalCarpilot.g:661:2: ( ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) ) | ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) ) )
            {
            // InternalCarpilot.g:661:2: ( ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) ) | ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=26 && LA12_0<=31)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=32 && LA12_0<=36)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCarpilot.g:662:3: ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) )
                    {
                    // InternalCarpilot.g:662:3: ( () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) ) )
                    // InternalCarpilot.g:663:4: () ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) )
                    {
                    // InternalCarpilot.g:663:4: ()
                    // InternalCarpilot.g:664:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorConditionAccess().getColorConditionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCarpilot.g:670:4: ( ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) ) )
                    // InternalCarpilot.g:671:5: ( (lv_color_1_0= ruleColor ) ) otherlv_2= '==' ( (lv_camera_3_0= ruleCamera ) )
                    {
                    // InternalCarpilot.g:671:5: ( (lv_color_1_0= ruleColor ) )
                    // InternalCarpilot.g:672:6: (lv_color_1_0= ruleColor )
                    {
                    // InternalCarpilot.g:672:6: (lv_color_1_0= ruleColor )
                    // InternalCarpilot.g:673:7: lv_color_1_0= ruleColor
                    {

                    							newCompositeNode(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_color_1_0=ruleColor();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getColorConditionRule());
                    							}
                    							set(
                    								current,
                    								"color",
                    								lv_color_1_0,
                    								"unice.epu.carpilot.xtext.Carpilot.Color");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_0_1_1());
                    				
                    // InternalCarpilot.g:694:5: ( (lv_camera_3_0= ruleCamera ) )
                    // InternalCarpilot.g:695:6: (lv_camera_3_0= ruleCamera )
                    {
                    // InternalCarpilot.g:695:6: (lv_camera_3_0= ruleCamera )
                    // InternalCarpilot.g:696:7: lv_camera_3_0= ruleCamera
                    {

                    							newCompositeNode(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_camera_3_0=ruleCamera();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getColorConditionRule());
                    							}
                    							set(
                    								current,
                    								"camera",
                    								lv_camera_3_0,
                    								"unice.epu.carpilot.xtext.Carpilot.Camera");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:716:3: ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) )
                    {
                    // InternalCarpilot.g:716:3: ( ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) ) )
                    // InternalCarpilot.g:717:4: ( (lv_camera_4_0= ruleCamera ) ) otherlv_5= '==' ( (lv_color_6_0= ruleColor ) )
                    {
                    // InternalCarpilot.g:717:4: ( (lv_camera_4_0= ruleCamera ) )
                    // InternalCarpilot.g:718:5: (lv_camera_4_0= ruleCamera )
                    {
                    // InternalCarpilot.g:718:5: (lv_camera_4_0= ruleCamera )
                    // InternalCarpilot.g:719:6: lv_camera_4_0= ruleCamera
                    {

                    						newCompositeNode(grammarAccess.getColorConditionAccess().getCameraCameraEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_camera_4_0=ruleCamera();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorConditionRule());
                    						}
                    						set(
                    							current,
                    							"camera",
                    							lv_camera_4_0,
                    							"unice.epu.carpilot.xtext.Carpilot.Camera");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getColorConditionAccess().getEqualsSignEqualsSignKeyword_1_1());
                    			
                    // InternalCarpilot.g:740:4: ( (lv_color_6_0= ruleColor ) )
                    // InternalCarpilot.g:741:5: (lv_color_6_0= ruleColor )
                    {
                    // InternalCarpilot.g:741:5: (lv_color_6_0= ruleColor )
                    // InternalCarpilot.g:742:6: lv_color_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getColorConditionAccess().getColorColorEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_6_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorConditionRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"unice.epu.carpilot.xtext.Carpilot.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleColorCondition"


    // $ANTLR start "entryRuleDistanceCondition"
    // InternalCarpilot.g:764:1: entryRuleDistanceCondition returns [EObject current=null] : iv_ruleDistanceCondition= ruleDistanceCondition EOF ;
    public final EObject entryRuleDistanceCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceCondition = null;


        try {
            // InternalCarpilot.g:764:58: (iv_ruleDistanceCondition= ruleDistanceCondition EOF )
            // InternalCarpilot.g:765:2: iv_ruleDistanceCondition= ruleDistanceCondition EOF
            {
             newCompositeNode(grammarAccess.getDistanceConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceCondition=ruleDistanceCondition();

            state._fsp--;

             current =iv_ruleDistanceCondition; 
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
    // $ANTLR end "entryRuleDistanceCondition"


    // $ANTLR start "ruleDistanceCondition"
    // InternalCarpilot.g:771:1: ruleDistanceCondition returns [EObject current=null] : ( ( (lv_sensor_0_0= ruleSensor ) ) ( (lv_operator_1_0= ruleAnalogOperand ) ) ( (lv_distance_2_0= ruleFloat ) ) ) ;
    public final EObject ruleDistanceCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_sensor_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalCarpilot.g:777:2: ( ( ( (lv_sensor_0_0= ruleSensor ) ) ( (lv_operator_1_0= ruleAnalogOperand ) ) ( (lv_distance_2_0= ruleFloat ) ) ) )
            // InternalCarpilot.g:778:2: ( ( (lv_sensor_0_0= ruleSensor ) ) ( (lv_operator_1_0= ruleAnalogOperand ) ) ( (lv_distance_2_0= ruleFloat ) ) )
            {
            // InternalCarpilot.g:778:2: ( ( (lv_sensor_0_0= ruleSensor ) ) ( (lv_operator_1_0= ruleAnalogOperand ) ) ( (lv_distance_2_0= ruleFloat ) ) )
            // InternalCarpilot.g:779:3: ( (lv_sensor_0_0= ruleSensor ) ) ( (lv_operator_1_0= ruleAnalogOperand ) ) ( (lv_distance_2_0= ruleFloat ) )
            {
            // InternalCarpilot.g:779:3: ( (lv_sensor_0_0= ruleSensor ) )
            // InternalCarpilot.g:780:4: (lv_sensor_0_0= ruleSensor )
            {
            // InternalCarpilot.g:780:4: (lv_sensor_0_0= ruleSensor )
            // InternalCarpilot.g:781:5: lv_sensor_0_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getSensorSensorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_sensor_0_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"sensor",
            						lv_sensor_0_0,
            						"unice.epu.carpilot.xtext.Carpilot.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCarpilot.g:798:3: ( (lv_operator_1_0= ruleAnalogOperand ) )
            // InternalCarpilot.g:799:4: (lv_operator_1_0= ruleAnalogOperand )
            {
            // InternalCarpilot.g:799:4: (lv_operator_1_0= ruleAnalogOperand )
            // InternalCarpilot.g:800:5: lv_operator_1_0= ruleAnalogOperand
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getOperatorAnalogOperandEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_operator_1_0=ruleAnalogOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"unice.epu.carpilot.xtext.Carpilot.AnalogOperand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCarpilot.g:817:3: ( (lv_distance_2_0= ruleFloat ) )
            // InternalCarpilot.g:818:4: (lv_distance_2_0= ruleFloat )
            {
            // InternalCarpilot.g:818:4: (lv_distance_2_0= ruleFloat )
            // InternalCarpilot.g:819:5: lv_distance_2_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getDistanceConditionAccess().getDistanceFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_2_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceConditionRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"unice.epu.carpilot.xtext.Carpilot.Float");
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
    // $ANTLR end "ruleDistanceCondition"


    // $ANTLR start "entryRuleFloat"
    // InternalCarpilot.g:840:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalCarpilot.g:840:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalCarpilot.g:841:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalCarpilot.g:847:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCarpilot.g:853:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalCarpilot.g:854:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalCarpilot.g:854:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalCarpilot.g:855:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalCarpilot.g:862:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCarpilot.g:863:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,21,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "ruleAnalogOperand"
    // InternalCarpilot.g:880:1: ruleAnalogOperand returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleAnalogOperand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCarpilot.g:886:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // InternalCarpilot.g:887:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalCarpilot.g:887:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            case 25:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCarpilot.g:888:3: (enumLiteral_0= '==' )
                    {
                    // InternalCarpilot.g:888:3: (enumLiteral_0= '==' )
                    // InternalCarpilot.g:889:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAnalogOperandAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnalogOperandAccess().getEqualsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:896:3: (enumLiteral_1= '>' )
                    {
                    // InternalCarpilot.g:896:3: (enumLiteral_1= '>' )
                    // InternalCarpilot.g:897:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAnalogOperandAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAnalogOperandAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:904:3: (enumLiteral_2= '<' )
                    {
                    // InternalCarpilot.g:904:3: (enumLiteral_2= '<' )
                    // InternalCarpilot.g:905:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAnalogOperandAccess().getLowerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAnalogOperandAccess().getLowerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:912:3: (enumLiteral_3= '>=' )
                    {
                    // InternalCarpilot.g:912:3: (enumLiteral_3= '>=' )
                    // InternalCarpilot.g:913:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAnalogOperandAccess().getGreaterEqualsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAnalogOperandAccess().getGreaterEqualsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:920:3: (enumLiteral_4= '<=' )
                    {
                    // InternalCarpilot.g:920:3: (enumLiteral_4= '<=' )
                    // InternalCarpilot.g:921:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAnalogOperandAccess().getLowerEqualsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAnalogOperandAccess().getLowerEqualsEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleAnalogOperand"


    // $ANTLR start "ruleColor"
    // InternalCarpilot.g:931:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'building' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCarpilot.g:937:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'building' ) ) )
            // InternalCarpilot.g:938:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'building' ) )
            {
            // InternalCarpilot.g:938:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'orange' ) | (enumLiteral_3= 'black' ) | (enumLiteral_4= 'white' ) | (enumLiteral_5= 'building' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 30:
                {
                alt15=5;
                }
                break;
            case 31:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCarpilot.g:939:3: (enumLiteral_0= 'red' )
                    {
                    // InternalCarpilot.g:939:3: (enumLiteral_0= 'red' )
                    // InternalCarpilot.g:940:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:947:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalCarpilot.g:947:3: (enumLiteral_1= 'blue' )
                    // InternalCarpilot.g:948:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:955:3: (enumLiteral_2= 'orange' )
                    {
                    // InternalCarpilot.g:955:3: (enumLiteral_2= 'orange' )
                    // InternalCarpilot.g:956:4: enumLiteral_2= 'orange'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getOrangeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:963:3: (enumLiteral_3= 'black' )
                    {
                    // InternalCarpilot.g:963:3: (enumLiteral_3= 'black' )
                    // InternalCarpilot.g:964:4: enumLiteral_3= 'black'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:971:3: (enumLiteral_4= 'white' )
                    {
                    // InternalCarpilot.g:971:3: (enumLiteral_4= 'white' )
                    // InternalCarpilot.g:972:4: enumLiteral_4= 'white'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCarpilot.g:979:3: (enumLiteral_5= 'building' )
                    {
                    // InternalCarpilot.g:979:3: (enumLiteral_5= 'building' )
                    // InternalCarpilot.g:980:4: enumLiteral_5= 'building'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getColorAccess().getBuildingEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getBuildingEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleCamera"
    // InternalCarpilot.g:990:1: ruleCamera returns [Enumerator current=null] : ( (enumLiteral_0= 'very right' ) | (enumLiteral_1= 'very left' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) | (enumLiteral_4= 'center' ) ) ;
    public final Enumerator ruleCamera() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCarpilot.g:996:2: ( ( (enumLiteral_0= 'very right' ) | (enumLiteral_1= 'very left' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) | (enumLiteral_4= 'center' ) ) )
            // InternalCarpilot.g:997:2: ( (enumLiteral_0= 'very right' ) | (enumLiteral_1= 'very left' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) | (enumLiteral_4= 'center' ) )
            {
            // InternalCarpilot.g:997:2: ( (enumLiteral_0= 'very right' ) | (enumLiteral_1= 'very left' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) | (enumLiteral_4= 'center' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCarpilot.g:998:3: (enumLiteral_0= 'very right' )
                    {
                    // InternalCarpilot.g:998:3: (enumLiteral_0= 'very right' )
                    // InternalCarpilot.g:999:4: enumLiteral_0= 'very right'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCameraAccess().getVery_rightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCameraAccess().getVery_rightEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:1006:3: (enumLiteral_1= 'very left' )
                    {
                    // InternalCarpilot.g:1006:3: (enumLiteral_1= 'very left' )
                    // InternalCarpilot.g:1007:4: enumLiteral_1= 'very left'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getCameraAccess().getVery_leftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCameraAccess().getVery_leftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:1014:3: (enumLiteral_2= 'left' )
                    {
                    // InternalCarpilot.g:1014:3: (enumLiteral_2= 'left' )
                    // InternalCarpilot.g:1015:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCameraAccess().getLeftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCameraAccess().getLeftEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:1022:3: (enumLiteral_3= 'right' )
                    {
                    // InternalCarpilot.g:1022:3: (enumLiteral_3= 'right' )
                    // InternalCarpilot.g:1023:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getCameraAccess().getRightEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCameraAccess().getRightEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:1030:3: (enumLiteral_4= 'center' )
                    {
                    // InternalCarpilot.g:1030:3: (enumLiteral_4= 'center' )
                    // InternalCarpilot.g:1031:4: enumLiteral_4= 'center'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCameraAccess().getCenterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCameraAccess().getCenterEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleCamera"


    // $ANTLR start "ruleDirection"
    // InternalCarpilot.g:1041:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'stop' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCarpilot.g:1047:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'stop' ) ) )
            // InternalCarpilot.g:1048:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'stop' ) )
            {
            // InternalCarpilot.g:1048:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'stop' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 38:
                {
                alt17=4;
                }
                break;
            case 39:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCarpilot.g:1049:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalCarpilot.g:1049:3: (enumLiteral_0= 'forward' )
                    // InternalCarpilot.g:1050:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:1057:3: (enumLiteral_1= 'left' )
                    {
                    // InternalCarpilot.g:1057:3: (enumLiteral_1= 'left' )
                    // InternalCarpilot.g:1058:4: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:1065:3: (enumLiteral_2= 'right' )
                    {
                    // InternalCarpilot.g:1065:3: (enumLiteral_2= 'right' )
                    // InternalCarpilot.g:1066:4: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCarpilot.g:1073:3: (enumLiteral_3= 'backward' )
                    {
                    // InternalCarpilot.g:1073:3: (enumLiteral_3= 'backward' )
                    // InternalCarpilot.g:1074:4: enumLiteral_3= 'backward'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getBackwardEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getBackwardEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCarpilot.g:1081:3: (enumLiteral_4= 'stop' )
                    {
                    // InternalCarpilot.g:1081:3: (enumLiteral_4= 'stop' )
                    // InternalCarpilot.g:1082:4: enumLiteral_4= 'stop'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getStopEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDirectionAccess().getStopEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleSensor"
    // InternalCarpilot.g:1092:1: ruleSensor returns [Enumerator current=null] : ( (enumLiteral_0= 'distance left' ) | (enumLiteral_1= 'distance right' ) | (enumLiteral_2= 'front' ) ) ;
    public final Enumerator ruleSensor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCarpilot.g:1098:2: ( ( (enumLiteral_0= 'distance left' ) | (enumLiteral_1= 'distance right' ) | (enumLiteral_2= 'front' ) ) )
            // InternalCarpilot.g:1099:2: ( (enumLiteral_0= 'distance left' ) | (enumLiteral_1= 'distance right' ) | (enumLiteral_2= 'front' ) )
            {
            // InternalCarpilot.g:1099:2: ( (enumLiteral_0= 'distance left' ) | (enumLiteral_1= 'distance right' ) | (enumLiteral_2= 'front' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCarpilot.g:1100:3: (enumLiteral_0= 'distance left' )
                    {
                    // InternalCarpilot.g:1100:3: (enumLiteral_0= 'distance left' )
                    // InternalCarpilot.g:1101:4: enumLiteral_0= 'distance left'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getDistance_leftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorAccess().getDistance_leftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCarpilot.g:1108:3: (enumLiteral_1= 'distance right' )
                    {
                    // InternalCarpilot.g:1108:3: (enumLiteral_1= 'distance right' )
                    // InternalCarpilot.g:1109:4: enumLiteral_1= 'distance right'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getDistance_rightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorAccess().getDistance_rightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCarpilot.g:1116:3: (enumLiteral_2= 'front' )
                    {
                    // InternalCarpilot.g:1116:3: (enumLiteral_2= 'front' )
                    // InternalCarpilot.g:1117:4: enumLiteral_2= 'front'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSensorAccess().getFrontEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorAccess().getFrontEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleSensor"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\65\uffff";
    static final String dfa_2s = "\42\uffff\1\54\2\uffff\5\54\6\uffff\5\54";
    static final String dfa_3s = "\1\32\16\24\1\40\1\32\5\6\14\17\1\15\1\6\1\42\5\15\1\uffff\1\22\1\uffff\1\17\1\23\1\42\5\15";
    static final String dfa_4s = "\1\52\13\24\3\31\1\44\1\37\5\6\13\17\1\25\1\47\1\6\1\47\5\20\1\uffff\1\23\1\uffff\1\17\1\23\1\47\5\20";
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
            "\1\21\1\uffff\1\22\1\23\1\24\1\25",
            "\1\21\1\uffff\1\22\1\23\1\24\1\25",
            "\1\21\1\uffff\1\22\1\23\1\24\1\25",
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
            "\1\42\5\uffff\1\43",
            "\2\54\1\uffff\1\52\1\53\1\uffff\1\44\16\uffff\1\46\1\47\1\uffff\1\45\1\50\1\51",
            "\1\55",
            "\1\46\1\47\1\uffff\1\45\1\50\1\51",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "",
            "\1\56\1\57",
            "",
            "\1\42",
            "\1\57",
            "\1\61\1\62\1\uffff\1\60\1\63\1\64",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52",
            "\2\54\1\uffff\1\52"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "295:2: (this_PersistingRule_0= rulePersistingRule | this_DirectRule_1= ruleDirectRule )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000071FFC000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000EC00082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000EC000A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000EC00080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001FFC000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000FC000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003D00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});

}