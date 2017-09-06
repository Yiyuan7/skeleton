/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Tagsreceipts;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagsreceiptsRecord extends UpdatableRecordImpl<TagsreceiptsRecord> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = 1926702372;

	/**
	 * Setter for <code>public.tagsreceipts.tagid</code>.
	 */
	public void setTagid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tagsreceipts.tagid</code>.
	 */
	public Integer getTagid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.tagsreceipts.receiptid</code>.
	 */
	public void setReceiptid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tagsreceipts.receiptid</code>.
	 */
	public Integer getReceiptid() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Tagsreceipts.TAGSRECEIPTS.TAGID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Tagsreceipts.TAGSRECEIPTS.RECEIPTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getTagid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getReceiptid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsreceiptsRecord value1(Integer value) {
		setTagid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsreceiptsRecord value2(Integer value) {
		setReceiptid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsreceiptsRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TagsreceiptsRecord
	 */
	public TagsreceiptsRecord() {
		super(Tagsreceipts.TAGSRECEIPTS);
	}

	/**
	 * Create a detached, initialised TagsreceiptsRecord
	 */
	public TagsreceiptsRecord(Integer tagid, Integer receiptid) {
		super(Tagsreceipts.TAGSRECEIPTS);

		setValue(0, tagid);
		setValue(1, receiptid);
	}
}
