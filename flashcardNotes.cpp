#include <string>
#include <iostream>
#include <cstdlib>

using namespace std;

class Flashcard{
	string acronym, name, context, definition;

	public:
		Flashcard(string acr,string n, string ctxt,string def);

};

Flashcard::Flashcard(string acr,string n, string ctxt,string def){
			acronym = acr;
			name = n;
			context = ctxt;
			definition = def;
}

// f{acr{AS} n{autonomous systems} ctxt{advanced internetworking} def{a network that is administered independently of other ASs}}
// f{n{area} ctxt{advanced internetworking} def{set of routers that are administratively configured to echange link-state information with each other}}
// f{acr{ABR} n{area border router} ctxt{advanced internetworking} def{a router that is a member of both the backbone area and a nonbackbone area}}

int main(int argc, char* argv){
	Flashcard table[] = {
	Flashcard("", "virtual link", "advanced internetworking", 
		"use a trick to flexibly decide which routers go in backbone. obtained by configuring a router that is not directly connected to backbone to exchange backbone routing information with a router that is"),
	Flashcard("ISP", "Internet Service Provider", "","private company. mainly existingto provide service to 'customers'"),
	Flashcard("","domain", "internetworking", "an autonomous system in the internet"),
	Flashcard("","interdomain routing", "","routing between two autonomous systems(ASs)"),
	Flashcard("","intradomain routing", "","routing within an autonomous system (AS)"),
	Flashcard("EGP", "Exterior Gateway Protocol", "interdomain routing protocol",
	"first interdomain routing protocol, constrained topology of internet significantly... used when internet was a tree topology, did not allow for topology to become more general. single backbone"),
	Flashcard("BGP","Border Gateway Protocol", "interdomain routing protocol",
		"replacement for EGP, currently in version 4, no assumptions about how ASs are connected. does not belong to either distance-vector or link-state protocols. advertises complete paths. sometimes called path-vector protocol. sits on top of TCP and sends occasional kepp alive message "),
	Flashcard("", "peering point", "internetworking",
		"a thing ISPs will often arrage to interconnect with each other"),
	Flashcard("","local traffic", "interdomain routing",
		"trafiic that originates at or terminated on nodes within an AS"),
	Flashcard("","transit traffic","interdomain routing",
		"traffic that passes through an AS"),
	Flashcard("","Stub AS","interdomain networking", 
		"an AS that has onle a single connection to one other AS; will only carry local traffic")
	Flashcard("","Multihomed AS", "interdomain routing",
		"an AS that has connections to more than one other AS but that refuses to carry transit traffic"),
	Flashcard("","Transit AS", "interdomain routing", "an AS that has connections to more than one other AS and that is designed to carry both transit and local traffic")
	Flashcard("", "withdrawn route", "interdomain networking", "if a BGP needs to cancel a previously advertised path, use this form of negative advertisement")

	};

	for 
}