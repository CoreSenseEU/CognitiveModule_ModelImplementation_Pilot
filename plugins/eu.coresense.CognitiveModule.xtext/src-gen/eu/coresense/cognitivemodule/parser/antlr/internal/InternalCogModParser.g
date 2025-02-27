/*
 * generated by Xtext 2.38.0
 */
parser grammar InternalCogModParser;

options {
	tokenVocab=InternalCogModLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
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

}

@members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleCognitiveModule
entryRuleCognitiveModule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCognitiveModuleRule()); }
	iv_ruleCognitiveModule=ruleCognitiveModule
	{ $current=$iv_ruleCognitiveModule.current; }
	EOF;

// Rule CognitiveModule
ruleCognitiveModule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCognitiveModuleAccess().getCognitiveModuleAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getCognitiveModuleAccess().getColonKeyword_2());
		}
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_3());
		}
		otherlv_4=Core
		{
			newLeafNode(otherlv_4, grammarAccess.getCognitiveModuleAccess().getCoreKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getCoreCoreParserRuleCall_5_0());
				}
				lv_core_5_0=ruleCore
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
					}
					set(
						$current,
						"core",
						lv_core_5_0,
						"eu.coresense.cognitivemodule.CogMod.Core");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=Efferent
			{
				newLeafNode(otherlv_6, grammarAccess.getCognitiveModuleAccess().getEfferentKeyword_6_0());
			}
			this_BEGIN_7=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_7, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCognitiveModuleAccess().getEfferentModeletParserRuleCall_6_2_0());
					}
					lv_efferent_8_0=ruleModelet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
						}
						add(
							$current,
							"efferent",
							lv_efferent_8_0,
							"eu.coresense.cognitivemodule.CogMod.Modelet");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_END_9=RULE_END
			{
				newLeafNode(this_END_9, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_6_3());
			}
		)?
		(
			otherlv_10=Afferent
			{
				newLeafNode(otherlv_10, grammarAccess.getCognitiveModuleAccess().getAfferentKeyword_7_0());
			}
			this_BEGIN_11=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_11, grammarAccess.getCognitiveModuleAccess().getBEGINTerminalRuleCall_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCognitiveModuleAccess().getAfferentModeletParserRuleCall_7_2_0());
					}
					lv_afferent_12_0=ruleModelet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
						}
						add(
							$current,
							"afferent",
							lv_afferent_12_0,
							"eu.coresense.cognitivemodule.CogMod.Modelet");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_END_13=RULE_END
			{
				newLeafNode(this_END_13, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_7_3());
			}
		)?
		otherlv_14=Meta
		{
			newLeafNode(otherlv_14, grammarAccess.getCognitiveModuleAccess().getMetaKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getMetaMetaParserRuleCall_9_0());
				}
				lv_meta_15_0=ruleMeta
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
					}
					set(
						$current,
						"meta",
						lv_meta_15_0,
						"eu.coresense.cognitivemodule.CogMod.Meta");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16=Coupling
		{
			newLeafNode(otherlv_16, grammarAccess.getCognitiveModuleAccess().getCouplingKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCognitiveModuleAccess().getCouplingCouplingParserRuleCall_11_0());
				}
				lv_coupling_17_0=ruleCoupling
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCognitiveModuleRule());
					}
					set(
						$current,
						"coupling",
						lv_coupling_17_0,
						"eu.coresense.cognitivemodule.CogMod.Coupling");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_END_18=RULE_END
		{
			newLeafNode(this_END_18, grammarAccess.getCognitiveModuleAccess().getENDTerminalRuleCall_12());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleCore
entryRuleCore returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCoreRule()); }
	iv_ruleCore=ruleCore
	{ $current=$iv_ruleCore.current; }
	EOF;

// Rule Core
ruleCore returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCoreAccess().getCoreAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCoreAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCoreRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModelet
entryRuleModelet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModeletRule()); }
	iv_ruleModelet=ruleModelet
	{ $current=$iv_ruleModelet.current; }
	EOF;

// Rule Modelet
ruleModelet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModeletAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModeletRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getModeletAccess().getColonKeyword_1());
		}
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getModeletAccess().getBEGINTerminalRuleCall_2());
		}
		otherlv_3=Topic
		{
			newLeafNode(otherlv_3, grammarAccess.getModeletAccess().getTopicKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModeletAccess().getTopicEStringParserRuleCall_4_0());
				}
				lv_topic_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModeletRule());
					}
					set(
						$current,
						"topic",
						lv_topic_4_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=Type
		{
			newLeafNode(otherlv_5, grammarAccess.getModeletAccess().getTypeKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModeletAccess().getTypeEStringParserRuleCall_6_0());
				}
				lv_type_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModeletRule());
					}
					set(
						$current,
						"type",
						lv_type_6_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_END_7=RULE_END
		{
			newLeafNode(this_END_7, grammarAccess.getModeletAccess().getENDTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleMeta
entryRuleMeta returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetaRule()); }
	iv_ruleMeta=ruleMeta
	{ $current=$iv_ruleMeta.current; }
	EOF;

// Rule Meta
ruleMeta returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMetaAccess().getMetaAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMetaAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMetaRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCoupling
entryRuleCoupling returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCouplingRule()); }
	iv_ruleCoupling=ruleCoupling
	{ $current=$iv_ruleCoupling.current; }
	EOF;

// Rule Coupling
ruleCoupling returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCouplingAccess().getCouplingAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCouplingAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCouplingRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"eu.coresense.cognitivemodule.CogMod.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;
