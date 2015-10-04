package com.lowcoupling.lng.plan.parser.antlr.internal; 

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
import com.lowcoupling.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_STRING", "RULE_CLOSEDCURLY", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'dependsOn'", "'plan'", "'.'", "';'", "'Resources'", "'Resource'", "'CheckPoint'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPlanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlanParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g"; }



     	private PlanGrammarAccess grammarAccess;
     	
        public InternalPlanParser(TokenStream input, PlanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected PlanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:70:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:77:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_9=null;
        Token this_CLOSEDCURLY_13=null;
        EObject lv_plans_7_0 = null;

        EObject lv_projects_12_0 = null;

        EObject lv_projects_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:80:28: ( ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==13) ) {
                    alt6=1;
                }
                else if ( (LA6_1==16) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ML_COMMENT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            {
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:83:3: lv_description_0_0= RULE_ML_COMMENT
                            {
                            lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProgram128); 

                            			newLeafNode(lv_description_0_0, grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_0_0, 
                                    		"ML_COMMENT");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:99:3: (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:99:5: otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProgram147); 

                        	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_0_1_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:103:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:105:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram164); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProgram180); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:125:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:125:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProgram192); 

                                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0());
                                
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:129:1: ( (lv_longName_5_0= RULE_STRING ) )
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            {
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:131:3: lv_longName_5_0= RULE_STRING
                            {
                            lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram209); 

                            			newLeafNode(lv_longName_5_0, grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_5_0, 
                                    		"STRING");
                            	    

                            }


                            }

                             
                                    newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
                                
                            pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram230);
                            ruleENDLINE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:155:3: ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:157:3: lv_plans_7_0= rulePlanImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePlanImport_in_ruleProgram253);
                    	    lv_plans_7_0=rulePlanImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plans",
                    	            		lv_plans_7_0, 
                    	            		"PlanImport");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram269);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:181:3: (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:181:5: otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleProgram283); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0());
                    	        
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:185:1: ( ( ruleQualifiedName ) )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:187:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProgramRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProgram306);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram322);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:208:3: ( (lv_projects_12_0= ruleProject ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ML_COMMENT||LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:210:3: lv_projects_12_0= ruleProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProject_in_ruleProgram344);
                    	    lv_projects_12_0=ruleProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_12_0, 
                    	            		"Project");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_CLOSEDCURLY_13=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356); 
                     
                        newLeafNode(this_CLOSEDCURLY_13, grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:233:3: lv_projects_14_0= ruleProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProject_in_ruleProgram384);
                    lv_projects_14_0=ruleProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_14_0, 
                            		"Project");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:257:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:258:2: (iv_ruleProject= ruleProject EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:259:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject420);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject430); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:266:1: ruleProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( (lv_resources_7_0= ruleResources ) )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_10=null;
        Token this_OPENCURLY_11=null;
        Token this_CLOSEDCURLY_13=null;
        Token otherlv_14=null;
        Token this_OPENCURLY_15=null;
        Token this_CLOSEDCURLY_17=null;
        Token this_CLOSEDCURLY_19=null;
        EObject lv_resources_7_0 = null;

        EObject lv_plans_8_0 = null;

        EObject lv_assumptions_12_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_activities_18_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:269:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( (lv_resources_7_0= ruleResources ) )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( (lv_resources_7_0= ruleResources ) )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( (lv_resources_7_0= ruleResources ) )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( (lv_resources_7_0= ruleResources ) )? ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )? (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )? ( (lv_activities_18_0= ruleActivityElement ) )* this_CLOSEDCURLY_19= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:272:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProject472); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProject490); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:292:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:294:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject507); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject523); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:314:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:314:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProject535); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:318:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:320:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject552); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject573);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:344:3: ( (lv_resources_7_0= ruleResources ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_resources_7_0= ruleResources )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_resources_7_0= ruleResources )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:346:3: lv_resources_7_0= ruleResources
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourcesParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResources_in_ruleProject595);
                    lv_resources_7_0=ruleResources();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"resources",
                            		lv_resources_7_0, 
                            		"Resources");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:362:3: ( ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:362:4: ( (lv_plans_8_0= rulePlanImport ) ) ruleENDLINE
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:362:4: ( (lv_plans_8_0= rulePlanImport ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:363:1: (lv_plans_8_0= rulePlanImport )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:363:1: (lv_plans_8_0= rulePlanImport )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:364:3: lv_plans_8_0= rulePlanImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlanImport_in_ruleProject618);
            	    lv_plans_8_0=rulePlanImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_8_0, 
            	            		"PlanImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject634);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:388:3: (otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:388:5: otherlv_10= 'assumptions' this_OPENCURLY_11= RULE_OPENCURLY ( (lv_assumptions_12_0= ruleAssumption ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleProject648); 

                        	newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getAssumptionsKeyword_7_0());
                        
                    this_OPENCURLY_11=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject659); 
                     
                        newLeafNode(this_OPENCURLY_11, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_7_1()); 
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:396:1: ( (lv_assumptions_12_0= ruleAssumption ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:397:1: (lv_assumptions_12_0= ruleAssumption )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:397:1: (lv_assumptions_12_0= ruleAssumption )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:398:3: lv_assumptions_12_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssumption_in_ruleProject679);
                    	    lv_assumptions_12_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assumptions",
                    	            		lv_assumptions_12_0, 
                    	            		"Assumption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_CLOSEDCURLY_13=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject691); 
                     
                        newLeafNode(this_CLOSEDCURLY_13, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_7_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:418:3: (otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:418:5: otherlv_14= 'constraints' this_OPENCURLY_15= RULE_OPENCURLY ( (lv_constraints_16_0= ruleConstraint ) )* this_CLOSEDCURLY_17= RULE_CLOSEDCURLY
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleProject705); 

                        	newLeafNode(otherlv_14, grammarAccess.getProjectAccess().getConstraintsKeyword_8_0());
                        
                    this_OPENCURLY_15=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject716); 
                     
                        newLeafNode(this_OPENCURLY_15, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:426:1: ( (lv_constraints_16_0= ruleConstraint ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:427:1: (lv_constraints_16_0= ruleConstraint )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:427:1: (lv_constraints_16_0= ruleConstraint )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:428:3: lv_constraints_16_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleProject736);
                    	    lv_constraints_16_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_16_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    this_CLOSEDCURLY_17=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject748); 
                     
                        newLeafNode(this_CLOSEDCURLY_17, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:448:3: ( (lv_activities_18_0= ruleActivityElement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ML_COMMENT||LA15_0==20||LA15_0==27||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:449:1: (lv_activities_18_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:449:1: (lv_activities_18_0= ruleActivityElement )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:450:3: lv_activities_18_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleProject770);
            	    lv_activities_18_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_18_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            this_CLOSEDCURLY_19=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject782); 
             
                newLeafNode(this_CLOSEDCURLY_19, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_10()); 
                

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:478:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:479:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:480:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption817);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption827); 

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
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:487:1: ruleAssumption returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:490:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:491:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:491:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:491:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAssumption864); 

                	newLeafNode(otherlv_0, grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:495:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:496:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:496:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:497:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssumption881); 

            			newLeafNode(lv_value_1_0, grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssumptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleAssumption902);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:529:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:530:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:531:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint937);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint947); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:538:1: ruleConstraint returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:541:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:542:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:542:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:542:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleConstraint984); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:546:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:547:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:547:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:548:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1001); 

            			newLeafNode(lv_value_1_0, grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleConstraint1022);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:580:1: entryRuleActivityGroup returns [EObject current=null] : iv_ruleActivityGroup= ruleActivityGroup EOF ;
    public final EObject entryRuleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityGroup = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:581:2: (iv_ruleActivityGroup= ruleActivityGroup EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:582:2: iv_ruleActivityGroup= ruleActivityGroup EOF
            {
             newCompositeNode(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1057);
            iv_ruleActivityGroup=ruleActivityGroup();

            state._fsp--;

             current =iv_ruleActivityGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup1067); 

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
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:589:1: ruleActivityGroup returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivityGroup() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token this_CLOSEDCURLY_11=null;
        EObject lv_activities_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:592:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:593:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:593:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:593:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_10_0= ruleActivityElement ) )* this_CLOSEDCURLY_11= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:593:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ML_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:594:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:594:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:595:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1109); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleActivityGroup1127); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityGroupAccess().getGroupKeyword_1());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:615:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:616:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:616:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:617:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityGroup1144); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1160); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:637:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:637:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivityGroup1172); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityGroupAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:641:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:642:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:642:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:643:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityGroup1189); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1210);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:667:3: (otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:667:5: otherlv_7= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActivityGroup1224); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityGroupAccess().getDependsOnKeyword_5_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:671:1: ( ( ruleQualifiedName ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:672:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:672:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:673:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityGroup1247);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1264);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:694:3: ( (lv_activities_10_0= ruleActivityElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ML_COMMENT||LA20_0==20||LA20_0==27||LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:695:1: (lv_activities_10_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:695:1: (lv_activities_10_0= ruleActivityElement )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:696:3: lv_activities_10_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleActivityGroup1286);
            	    lv_activities_10_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_10_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_CLOSEDCURLY_11=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1298); 
             
                newLeafNode(this_CLOSEDCURLY_11, grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:728:1: entryRulePlanImport returns [EObject current=null] : iv_rulePlanImport= rulePlanImport EOF ;
    public final EObject entryRulePlanImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanImport = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:729:2: (iv_rulePlanImport= rulePlanImport EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:730:2: iv_rulePlanImport= rulePlanImport EOF
            {
             newCompositeNode(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport1337);
            iv_rulePlanImport=rulePlanImport();

            state._fsp--;

             current =iv_rulePlanImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport1347); 

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
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:737:1: rulePlanImport returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePlanImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:740:28: ( (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:741:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:741:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:741:3: otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePlanImport1384); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanImportAccess().getPlanKeyword_0());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:745:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:746:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:746:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:747:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlanImport1401); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:771:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:772:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:773:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1443);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1454); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:780:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:783:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:784:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:784:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:784:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1494); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:791:1: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:792:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName1513); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1528); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:814:1: entryRuleActivityElement returns [EObject current=null] : iv_ruleActivityElement= ruleActivityElement EOF ;
    public final EObject entryRuleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElement = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:815:2: (iv_ruleActivityElement= ruleActivityElement EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:816:2: iv_ruleActivityElement= ruleActivityElement EOF
            {
             newCompositeNode(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement1577);
            iv_ruleActivityElement=ruleActivityElement();

            state._fsp--;

             current =iv_ruleActivityElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement1587); 

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
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:823:1: ruleActivityElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) ;
    public final EObject ruleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_CheckPoint_1 = null;

        EObject this_ActivityGroup_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:826:28: ( (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:827:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:827:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt22=1;
                    }
                    break;
                case 20:
                    {
                    alt22=3;
                    }
                    break;
                case 27:
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                alt22=1;
                }
                break;
            case 27:
                {
                alt22=2;
                }
                break;
            case 20:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:828:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleActivityElement1634);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:838:5: this_CheckPoint_1= ruleCheckPoint
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckPoint_in_ruleActivityElement1661);
                    this_CheckPoint_1=ruleCheckPoint();

                    state._fsp--;

                     
                            current = this_CheckPoint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:848:5: this_ActivityGroup_2= ruleActivityGroup
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActivityGroup_in_ruleActivityElement1688);
                    this_ActivityGroup_2=ruleActivityGroup();

                    state._fsp--;

                     
                            current = this_ActivityGroup_2; 
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
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:864:1: entryRuleENDLINE returns [String current=null] : iv_ruleENDLINE= ruleENDLINE EOF ;
    public final String entryRuleENDLINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENDLINE = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:865:2: (iv_ruleENDLINE= ruleENDLINE EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:866:2: iv_ruleENDLINE= ruleENDLINE EOF
            {
             newCompositeNode(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE1724);
            iv_ruleENDLINE=ruleENDLINE();

            state._fsp--;

             current =iv_ruleENDLINE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE1735); 

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
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:873:1: ruleENDLINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleENDLINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:876:28: (kw= ';' )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:878:2: kw= ';'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleENDLINE1772); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
                

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
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleResources"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:891:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:892:2: (iv_ruleResources= ruleResources EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:893:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_ruleResources_in_entryRuleResources1811);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResources1821); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:900:1: ruleResources returns [EObject current=null] : (otherlv_0= 'Resources' this_OPENCURLY_1= RULE_OPENCURLY ( (lv_resource_2_0= ruleResource ) )* this_CLOSEDCURLY_3= RULE_CLOSEDCURLY ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OPENCURLY_1=null;
        Token this_CLOSEDCURLY_3=null;
        EObject lv_resource_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:903:28: ( (otherlv_0= 'Resources' this_OPENCURLY_1= RULE_OPENCURLY ( (lv_resource_2_0= ruleResource ) )* this_CLOSEDCURLY_3= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:904:1: (otherlv_0= 'Resources' this_OPENCURLY_1= RULE_OPENCURLY ( (lv_resource_2_0= ruleResource ) )* this_CLOSEDCURLY_3= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:904:1: (otherlv_0= 'Resources' this_OPENCURLY_1= RULE_OPENCURLY ( (lv_resource_2_0= ruleResource ) )* this_CLOSEDCURLY_3= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:904:3: otherlv_0= 'Resources' this_OPENCURLY_1= RULE_OPENCURLY ( (lv_resource_2_0= ruleResource ) )* this_CLOSEDCURLY_3= RULE_CLOSEDCURLY
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleResources1858); 

                	newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
                
            this_OPENCURLY_1=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleResources1869); 
             
                newLeafNode(this_OPENCURLY_1, grammarAccess.getResourcesAccess().getOPENCURLYTerminalRuleCall_1()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:912:1: ( (lv_resource_2_0= ruleResource ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:913:1: (lv_resource_2_0= ruleResource )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:913:1: (lv_resource_2_0= ruleResource )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:914:3: lv_resource_2_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourcesAccess().getResourceResourceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleResources1889);
            	    lv_resource_2_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourcesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resource",
            	            		lv_resource_2_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            this_CLOSEDCURLY_3=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleResources1901); 
             
                newLeafNode(this_CLOSEDCURLY_3, grammarAccess.getResourcesAccess().getCLOSEDCURLYTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResource"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:942:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:943:2: (iv_ruleResource= ruleResource EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:944:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1936);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1946); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:951:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:954:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:955:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:955:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:955:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource1983); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:959:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:960:1: (lv_name_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:960:1: (lv_name_1_0= RULE_STRING )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:961:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource2000); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getResourceAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleResource2021);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:993:1: entryRuleCheckPoint returns [EObject current=null] : iv_ruleCheckPoint= ruleCheckPoint EOF ;
    public final EObject entryRuleCheckPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckPoint = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:994:2: (iv_ruleCheckPoint= ruleCheckPoint EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:995:2: iv_ruleCheckPoint= ruleCheckPoint EOF
            {
             newCompositeNode(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2056);
            iv_ruleCheckPoint=ruleCheckPoint();

            state._fsp--;

             current =iv_ruleCheckPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint2066); 

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
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1002:1: ruleCheckPoint returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY ) ;
    public final EObject ruleCheckPoint() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_8=null;
        Token lv_end_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_offset_14_0=null;
        Token otherlv_16=null;
        Token lv_completeness_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_CLOSEDCURLY_23=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1005:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1006:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1006:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1006:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'CheckPoint' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_23= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1006:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ML_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1007:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1007:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1008:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2108); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCheckPoint2126); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckPointAccess().getCheckPointKeyword_1());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1028:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1029:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1029:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1030:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckPoint2143); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2159); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1050:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1050:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCheckPoint2171); 

                        	newLeafNode(otherlv_4, grammarAccess.getCheckPointAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1054:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1055:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1055:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1056:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2188); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2209);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1080:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1082:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1082:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1083:2: ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1086:2: ( ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1087:3: ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1087:3: ( ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( LA29_0 >=28 && LA29_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1089:4: ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1089:4: ({...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1090:5: {...}? => ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1090:107: ( ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1091:6: ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:6: ({...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:7: {...}? => ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:16: ( (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==28) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==29) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:17: (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:17: (otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1094:19: otherlv_8= 'date' ( (lv_end_9_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleCheckPoint2269); 

            	                	newLeafNode(otherlv_8, grammarAccess.getCheckPointAccess().getDateKeyword_5_0_0_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1098:1: ( (lv_end_9_0= RULE_STRING ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1099:1: (lv_end_9_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1099:1: (lv_end_9_0= RULE_STRING )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1100:3: lv_end_9_0= RULE_STRING
            	            {
            	            lv_end_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2286); 

            	            			newLeafNode(lv_end_9_0, grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_5_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_9_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2307);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1125:6: (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1125:6: (otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1125:8: otherlv_11= 'after' ( ( ruleQualifiedName ) ) otherlv_13= 'offset' ( (lv_offset_14_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleCheckPoint2326); 

            	                	newLeafNode(otherlv_11, grammarAccess.getCheckPointAccess().getAfterKeyword_5_0_1_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1129:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1130:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1130:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1131:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_5_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2349);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_13=(Token)match(input,30,FOLLOW_30_in_ruleCheckPoint2361); 

            	                	newLeafNode(otherlv_13, grammarAccess.getCheckPointAccess().getOffsetKeyword_5_0_1_2());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1148:1: ( (lv_offset_14_0= RULE_INT ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1149:1: (lv_offset_14_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1149:1: (lv_offset_14_0= RULE_INT )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1150:3: lv_offset_14_0= RULE_INT
            	            {
            	            lv_offset_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2378); 

            	            			newLeafNode(lv_offset_14_0, grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_5_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_14_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2399);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1181:4: ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1181:4: ({...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1182:5: {...}? => ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1182:107: ( ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1183:6: ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1186:6: ({...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1186:7: {...}? => (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1186:16: (otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1186:18: otherlv_16= 'completeness' ( (lv_completeness_17_0= RULE_INT ) ) otherlv_18= '%' ruleENDLINE (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_31_in_ruleCheckPoint2467); 

            	        	newLeafNode(otherlv_16, grammarAccess.getCheckPointAccess().getCompletenessKeyword_5_1_0());
            	        
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1190:1: ( (lv_completeness_17_0= RULE_INT ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1191:1: (lv_completeness_17_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1191:1: (lv_completeness_17_0= RULE_INT )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1192:3: lv_completeness_17_0= RULE_INT
            	    {
            	    lv_completeness_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2484); 

            	    			newLeafNode(lv_completeness_17_0, grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_5_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_17_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleCheckPoint2501); 

            	        	newLeafNode(otherlv_18, grammarAccess.getCheckPointAccess().getPercentSignKeyword_5_1_2());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_3()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2517);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1220:1: (otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==21) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1220:3: otherlv_20= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	            {
            	            otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleCheckPoint2529); 

            	                	newLeafNode(otherlv_20, grammarAccess.getCheckPointAccess().getDependsOnKeyword_5_1_4_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1224:1: ( ( ruleQualifiedName ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==RULE_ID) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1225:1: ( ruleQualifiedName )
            	            	    {
            	            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1225:1: ( ruleQualifiedName )
            	            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1226:3: ruleQualifiedName
            	            	    {

            	            	    			if (current==null) {
            	            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	    	        }
            	            	            
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_5_1_4_1_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2552);
            	            	    ruleQualifiedName();

            	            	    state._fsp--;

            	            	     
            	            	    	        afterParserOrEnumRuleCall();
            	            	    	    

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop27;
            	                }
            	            } while (true);

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_5_1_4_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2569);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_5());
            	

            }

            this_CLOSEDCURLY_23=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2628); 
             
                newLeafNode(this_CLOSEDCURLY_23, grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1274:1: entryRuleResourceInvolvement returns [EObject current=null] : iv_ruleResourceInvolvement= ruleResourceInvolvement EOF ;
    public final EObject entryRuleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceInvolvement = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1275:2: (iv_ruleResourceInvolvement= ruleResourceInvolvement EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1276:2: iv_ruleResourceInvolvement= ruleResourceInvolvement EOF
            {
             newCompositeNode(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2663);
            iv_ruleResourceInvolvement=ruleResourceInvolvement();

            state._fsp--;

             current =iv_ruleResourceInvolvement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement2673); 

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
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1283:1: ruleResourceInvolvement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) ;
    public final EObject ruleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_occupation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_responsibility_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1286:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1287:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1287:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1287:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1287:2: ( (otherlv_0= RULE_ID ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1288:1: (otherlv_0= RULE_ID )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1288:1: (otherlv_0= RULE_ID )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1289:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceInvolvement2718); 

            		newLeafNode(otherlv_0, grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            	

            }


            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1300:2: (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1300:4: otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleResourceInvolvement2731); 

                        	newLeafNode(otherlv_1, grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1304:1: ( (lv_occupation_2_0= RULE_INT ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1305:1: (lv_occupation_2_0= RULE_INT )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1305:1: (lv_occupation_2_0= RULE_INT )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1306:3: lv_occupation_2_0= RULE_INT
                    {
                    lv_occupation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResourceInvolvement2748); 

                    			newLeafNode(lv_occupation_2_0, grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"occupation",
                            		lv_occupation_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleResourceInvolvement2765); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1326:3: (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1326:5: otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleResourceInvolvement2780); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1330:1: ( (lv_responsibility_5_0= ruleResponsibility ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1331:1: (lv_responsibility_5_0= ruleResponsibility )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1331:1: (lv_responsibility_5_0= ruleResponsibility )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1332:3: lv_responsibility_5_0= ruleResponsibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2801);
                    lv_responsibility_5_0=ruleResponsibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		set(
                           			current, 
                           			"responsibility",
                            		lv_responsibility_5_0, 
                            		"Responsibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2819);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1364:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1365:2: (iv_ruleActivity= ruleActivity EOF )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1366:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity2854);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity2864); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1373:1: ruleActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token this_OPENCURLY_8=null;
        Token this_CLOSEDCURLY_10=null;
        Token otherlv_12=null;
        Token lv_start_13_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_offset_18_0=null;
        Token otherlv_20=null;
        Token lv_end_21_0=null;
        Token otherlv_23=null;
        Token lv_duration_24_0=null;
        Token otherlv_26=null;
        Token lv_completeness_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token this_CLOSEDCURLY_33=null;
        EObject lv_involvedResources_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1376:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1377:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1377:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1377:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_33= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1377:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ML_COMMENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1378:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1378:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1379:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivity2906); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleActivity2924); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1399:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1400:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1400:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1401:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity2941); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity2957); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1421:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1421:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivity2969); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1425:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1426:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1427:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity2986); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3007);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1451:3: (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1451:5: otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleActivity3021); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getInvolvesKeyword_5_0());
                        
                    this_OPENCURLY_8=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity3032); 
                     
                        newLeafNode(this_OPENCURLY_8, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
                        
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1459:1: ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1460:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    {
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1460:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1461:3: lv_involvedResources_9_0= ruleResourceInvolvement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceInvolvement_in_ruleActivity3052);
                    	    lv_involvedResources_9_0=ruleResourceInvolvement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"involvedResources",
                    	            		lv_involvedResources_9_0, 
                    	            		"ResourceInvolvement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3064); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1481:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1483:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1483:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1484:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1487:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1488:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1488:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=4;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==29||LA39_0==37) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 >=38 && LA39_0<=39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
                    alt39=3;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1490:4: ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1490:4: ({...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1491:5: {...}? => ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1491:105: ( ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1492:6: ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 0);
            	    	 				
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:6: ({...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:7: {...}? => ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:16: ( (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==37) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==29) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:17: (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:17: (otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1495:19: otherlv_12= 'starts' ( (lv_start_13_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleActivity3124); 

            	                	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getStartsKeyword_6_0_0_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1499:1: ( (lv_start_13_0= RULE_STRING ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1500:1: (lv_start_13_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1500:1: (lv_start_13_0= RULE_STRING )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1501:3: lv_start_13_0= RULE_STRING
            	            {
            	            lv_start_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3141); 

            	            			newLeafNode(lv_start_13_0, grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_6_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"start",
            	                    		lv_start_13_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3162);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1526:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1526:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1526:8: otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleActivity3181); 

            	                	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getAfterKeyword_6_0_1_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1530:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1531:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1531:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1532:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_6_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3204);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_17=(Token)match(input,30,FOLLOW_30_in_ruleActivity3216); 

            	                	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getOffsetKeyword_6_0_1_2());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1549:1: ( (lv_offset_18_0= RULE_INT ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1550:1: (lv_offset_18_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1550:1: (lv_offset_18_0= RULE_INT )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1551:3: lv_offset_18_0= RULE_INT
            	            {
            	            lv_offset_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3233); 

            	            			newLeafNode(lv_offset_18_0, grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_6_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_18_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3254);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1582:4: ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1582:4: ({...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1583:5: {...}? => ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1583:105: ( ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1584:6: ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 1);
            	    	 				
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:6: ({...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:7: {...}? => ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:16: ( ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:17: ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_26= 'completeness' ( (lv_completeness_27_0= RULE_INT ) ) otherlv_28= '%' ruleENDLINE
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:17: ( (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==38) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==39) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:18: (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:18: (otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1587:20: otherlv_20= 'ends' ( (lv_end_21_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_38_in_ruleActivity3324); 

            	                	newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getEndsKeyword_6_1_0_0_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1591:1: ( (lv_end_21_0= RULE_STRING ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1592:1: (lv_end_21_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1592:1: (lv_end_21_0= RULE_STRING )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1593:3: lv_end_21_0= RULE_STRING
            	            {
            	            lv_end_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3341); 

            	            			newLeafNode(lv_end_21_0, grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_6_1_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_21_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3362);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1618:6: (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1618:6: (otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1618:8: otherlv_23= 'duration' ( (lv_duration_24_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_23=(Token)match(input,39,FOLLOW_39_in_ruleActivity3381); 

            	                	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getDurationKeyword_6_1_0_1_0());
            	                
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1622:1: ( (lv_duration_24_0= RULE_INT ) )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1623:1: (lv_duration_24_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1623:1: (lv_duration_24_0= RULE_INT )
            	            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1624:3: lv_duration_24_0= RULE_INT
            	            {
            	            lv_duration_24_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3398); 

            	            			newLeafNode(lv_duration_24_0, grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_6_1_0_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"duration",
            	                    		lv_duration_24_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_0_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3419);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_26=(Token)match(input,31,FOLLOW_31_in_ruleActivity3432); 

            	        	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getCompletenessKeyword_6_1_1());
            	        
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1652:1: ( (lv_completeness_27_0= RULE_INT ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1653:1: (lv_completeness_27_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1653:1: (lv_completeness_27_0= RULE_INT )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1654:3: lv_completeness_27_0= RULE_INT
            	    {
            	    lv_completeness_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3449); 

            	    			newLeafNode(lv_completeness_27_0, grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_6_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_27_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_28=(Token)match(input,32,FOLLOW_32_in_ruleActivity3466); 

            	        	newLeafNode(otherlv_28, grammarAccess.getActivityAccess().getPercentSignKeyword_6_1_3());
            	        
            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_1_4()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3482);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1689:4: ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1689:4: ({...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1690:5: {...}? => ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1690:105: ( ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1691:6: ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_6(), 2);
            	    	 				
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1694:6: ({...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1694:7: {...}? => (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1694:16: (otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1694:18: otherlv_30= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_30=(Token)match(input,21,FOLLOW_21_in_ruleActivity3549); 

            	        	newLeafNode(otherlv_30, grammarAccess.getActivityAccess().getDependsOnKeyword_6_2_0());
            	        
            	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1698:1: ( ( ruleQualifiedName ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==RULE_ID) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1699:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1699:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1700:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3572);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3589);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6()) ) {
                throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_6())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_6());
            	

            }

            this_CLOSEDCURLY_33=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3646); 
             
                newLeafNode(this_CLOSEDCURLY_33, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1750:1: ruleResponsibility returns [Enumerator current=null] : ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) ;
    public final Enumerator ruleResponsibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1752:28: ( ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) )
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1753:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            {
            // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1753:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt40=1;
                }
                break;
            case 41:
                {
                alt40=2;
                }
                break;
            case 42:
                {
                alt40=3;
                }
                break;
            case 43:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1753:2: (enumLiteral_0= 'RESPONSIBLE' )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1753:2: (enumLiteral_0= 'RESPONSIBLE' )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1753:4: enumLiteral_0= 'RESPONSIBLE'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleResponsibility3697); 

                            current = grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1759:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1759:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1759:8: enumLiteral_1= 'ACCOUNTABLE'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleResponsibility3714); 

                            current = grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1765:6: (enumLiteral_2= 'CONSULTED' )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1765:6: (enumLiteral_2= 'CONSULTED' )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1765:8: enumLiteral_2= 'CONSULTED'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleResponsibility3731); 

                            current = grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1771:6: (enumLiteral_3= 'INFORMED' )
                    {
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1771:6: (enumLiteral_3= 'INFORMED' )
                    // ../com.lowcoupling.lng.plan/src-gen/com/lowcoupling/lng/plan/parser/antlr/internal/InternalPlan.g:1771:8: enumLiteral_3= 'INFORMED'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleResponsibility3748); 

                            current = grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleResponsibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProgram128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProgram180 = new BitSet(new long[]{0x000000000041C110L});
    public static final BitSet FOLLOW_14_in_ruleProgram192 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram209 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram230 = new BitSet(new long[]{0x0000000000418110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProgram253 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram269 = new BitSet(new long[]{0x0000000000418110L});
    public static final BitSet FOLLOW_15_in_ruleProgram283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProgram306 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram322 = new BitSet(new long[]{0x0000000000018110L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram344 = new BitSet(new long[]{0x0000000000010110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProject472 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject523 = new BitSet(new long[]{0x000000080A564110L});
    public static final BitSet FOLLOW_14_in_ruleProject535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject552 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject573 = new BitSet(new long[]{0x000000080A560110L});
    public static final BitSet FOLLOW_ruleResources_in_ruleProject595 = new BitSet(new long[]{0x0000000808560110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProject618 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject634 = new BitSet(new long[]{0x0000000808560110L});
    public static final BitSet FOLLOW_17_in_ruleProject648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject659 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleAssumption_in_ruleProject679 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject691 = new BitSet(new long[]{0x0000000808140110L});
    public static final BitSet FOLLOW_18_in_ruleProject705 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject716 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleProject736 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject748 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleProject770 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssumption864 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssumption881 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleAssumption902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConstraint984 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1001 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleConstraint1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1109 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivityGroup1127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityGroup1144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1160 = new BitSet(new long[]{0x0000000808304110L});
    public static final BitSet FOLLOW_14_in_ruleActivityGroup1172 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityGroup1189 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1210 = new BitSet(new long[]{0x0000000808300110L});
    public static final BitSet FOLLOW_21_in_ruleActivityGroup1224 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityGroup1247 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1264 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleActivityGroup1286 = new BitSet(new long[]{0x0000000808100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlanImport1384 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlanImport1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1494 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName1513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1528 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleActivityElement1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_ruleActivityElement1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_ruleActivityElement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleENDLINE1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResources_in_entryRuleResources1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResources1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleResources1858 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleResources1869 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_ruleResource_in_ruleResources1889 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleResources1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource1983 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource2000 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleResource2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2108 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCheckPoint2126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckPoint2143 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2159 = new BitSet(new long[]{0x00000000B0004000L});
    public static final BitSet FOLLOW_14_in_ruleCheckPoint2171 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2188 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2209 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_28_in_ruleCheckPoint2269 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2286 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2307 = new BitSet(new long[]{0x00000000B0000100L});
    public static final BitSet FOLLOW_29_in_ruleCheckPoint2326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2349 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCheckPoint2361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2378 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2399 = new BitSet(new long[]{0x00000000B0000100L});
    public static final BitSet FOLLOW_31_in_ruleCheckPoint2467 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2484 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCheckPoint2501 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2517 = new BitSet(new long[]{0x00000000B0200100L});
    public static final BitSet FOLLOW_21_in_ruleCheckPoint2529 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2552 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2569 = new BitSet(new long[]{0x00000000B0000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceInvolvement2718 = new BitSet(new long[]{0x0000000601000000L});
    public static final BitSet FOLLOW_33_in_ruleResourceInvolvement2731 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResourceInvolvement2748 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleResourceInvolvement2765 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_ruleResourceInvolvement2780 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_ruleResponsibility_in_ruleResourceInvolvement2801 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleResourceInvolvement2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivity2906 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleActivity2924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity2941 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity2957 = new BitSet(new long[]{0x000000F020204000L});
    public static final BitSet FOLLOW_14_in_ruleActivity2969 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity2986 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3007 = new BitSet(new long[]{0x000000F020200000L});
    public static final BitSet FOLLOW_36_in_ruleActivity3021 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity3032 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_ruleActivity3052 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3064 = new BitSet(new long[]{0x000000E020200000L});
    public static final BitSet FOLLOW_37_in_ruleActivity3124 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3141 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3162 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_29_in_ruleActivity3181 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3204 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleActivity3216 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3233 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3254 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_38_in_ruleActivity3324 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3341 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3362 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_39_in_ruleActivity3381 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3398 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3419 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleActivity3432 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3449 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleActivity3466 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3482 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_21_in_ruleActivity3549 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3572 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3589 = new BitSet(new long[]{0x000000E020200100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleResponsibility3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleResponsibility3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleResponsibility3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleResponsibility3748 = new BitSet(new long[]{0x0000000000000002L});

}
