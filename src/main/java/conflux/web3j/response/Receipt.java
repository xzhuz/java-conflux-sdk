package conflux.web3j.response;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.web3j.utils.Numeric;

public class Receipt {
	private String transactionHash;
	private long index;
	private String blockHash;
	private String epochNumber;
	private String from;
	private String to;
	private String gasUsed;
	private String contractCreated;
	private List<LogEntry> logs;
	private String logsBloom;
	private String stateRoot;
	private short outcomeStatus;
	
	public String getTransactionHash() {
		return transactionHash;
	}
	
	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}
	
	public long getIndex() {
		return index;
	}
	
	public void setIndex(long index) {
		this.index = index;
	}
	
	public String getBlockHash() {
		return blockHash;
	}
	
	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}
	
	public BigInteger getEpochNumber() {
		return new BigInteger(this.epochNumber);
	}
	
	public void setEpochNumber(String epochNumber) {
		this.epochNumber = epochNumber;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public Optional<String> getTo() {
		if (this.to == null || this.to.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(this.to);
		}
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public BigInteger getGasUsed() {
		return Numeric.decodeQuantity(this.gasUsed);
	}
	
	public void setGasUsed(String gasUsed) {
		this.gasUsed = gasUsed;
	}
	
	public Optional<String> getContractCreated() {
		if (this.contractCreated == null || this.contractCreated.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(this.contractCreated);
		}
	}
	
	public void setContractCreated(String contractCreated) {
		this.contractCreated = contractCreated;
	}
	
	public List<LogEntry> getLogs() {
		return logs;
	}
	
	public void setLogs(List<LogEntry> logs) {
		this.logs = logs;
	}
	
	public String getLogsBloom() {
		return logsBloom;
	}
	
	public void setLogsBloom(String logsBloom) {
		this.logsBloom = logsBloom;
	}
	
	public String getStateRoot() {
		return stateRoot;
	}
	
	public void setStateRoot(String stateRoot) {
		this.stateRoot = stateRoot;
	}
	
	public short getOutcomeStatus() {
		return outcomeStatus;
	}
	
	public void setOutcomeStatus(short outcomeStatus) {
		this.outcomeStatus = outcomeStatus;
	}
}